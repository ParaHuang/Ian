package day21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Main5 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.txt"));
//				
//		Student s = new Student();
//		s.setNo(3);
//		s.setName("Jack");
//		s.setAge(19);
//		s.setGender("male");
//		
//		oos.writeObject(s);
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.txt"));
		
		Student o = (Student) ois.readObject();
		System.out.println(o.getName());
	}

}

class Student implements Serializable{//Stream
	private int no;
	private String name;
	private int age;
	private String gender;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
}
//Regular expression
//jdbc->database
//java web
//lambda
//html+css+javascript















