package day5;

public class Main1 {

	public static void main(String[] args) {
		new SubClass(10);
	}

}

//whenever you decide to create a constructor with paramter
//please still have the default one
class GreatSuperClass{
	public GreatSuperClass(int a) {
		System.out.println("Great super");
	}
	public GreatSuperClass() {
		// TODO Auto-generated constructor stub
	}
	
}

class SuperClass extends GreatSuperClass{
	
	public SuperClass(int a) {
		System.out.println("super");
	}
	
//	public SuperClass() {
//		// TODO Auto-generated constructor stub
//	}
}

class SubClass extends SuperClass{
	
	public SubClass() {
//		super();//write it or not, it's the same.always calling the empty constructor from super class
		super(10);
		System.out.println("sub");
	}
	
	public SubClass(int a) {
		super(5);
		System.out.println("sub with parameter");
	}
}









