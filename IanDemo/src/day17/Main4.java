package day17;

public class Main4 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Jack");
		try {
			s1.setAge(18);
			s1.setGender("oomale");
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(s1);
	}

}

//customized Exception
//1.define your own exception class, extends Exception,make it as an compile exception
// ???????????????
//2.throw the exception object at the place you want 
// throw new XxxxException();
class StudentException extends Exception{
	public StudentException(String message) {
		super(message);
	}
}


class Student{
	private String name;
	private int age;
	private String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws StudentException {
		if(age<0 || age>140) {
//			System.out.println("invalid student age");
//			raise an exception here
			throw new StudentException(age+" is not in the correct range, should be 1~120");	
		}else {
			this.age = age;
		}
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) throws StudentException {
		if(gender.equals("male") || gender.equals("female")) {
			this.gender = gender;
		}else {
			throw new StudentException(gender+" is not a valid gender, it can only be male or female");
		}
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}	
}











