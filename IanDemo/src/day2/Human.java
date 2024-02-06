package day2;

public class Human {
	
	
	//has name, age,gender,nationality			-- feature(object) ,attribute/filed(class)
	//1.every class has an invisible/default constructor
	//public Human(){}
	//2.once you start to write your own constructor, then the invisible one disappear
	private String name;
	private int age;
	
	//overload
	public Human(String name, int age) {
//		super();  //write or not, it's the same
		this.name = name;
		this.age = age;
	}
	
	public Human(String name) {
//		super();
		this.name = name;
	}



//	public Human() {
//		
//	}
	
	/*
	private String gender;
	private String nationality;
	
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

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
*/
	//can eat,sleep,make money					-- action/behavior(object),method(class)
	public void eat() {
		System.out.println("time to eat");
	}

	public void sleep() {
		System.out.println("it's dark,time to sleep");
	}

}	

