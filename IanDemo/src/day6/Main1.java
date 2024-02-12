package day6;

public class Main1 {

	public static void main(String[] args) {
		Chinese c = new Chinese();
//		c.eat();
//		c.sleep();
//		
//		System.out.println("====================");
		
		American a = new American();
//		a.eat();
//		a.sleep();
		
		Company company = new Company();
		company.party(c);
		System.out.println("====================");
		company.party(a);
	}

}

class Company{
	public void party(Human h) {
		System.out.println("it's party in company");
		h.eat();//polymorphism:one thing shows in different way: 1.reference type change    2.override
		System.out.println("time to go home");
		h.sleep();//no polymorphism
	}
}

abstract class Human{
	//override is importand for polymorphism
	//1.can we find a way to force polymorphism happen?
	//2.when we override,we never got a chance to use "time to eat"->time to eat is not importand
//	public void eat() {
//		System.out.println("time to eat");
//	}
	//1.eat method is important, but how to eat is not -> delete the body
	//2.a method without a body, then it's abstract
	//3.a class with abstract method, then this class is also abstract
	//4.Subclass are forced to override abstract method in Superclass
	public abstract void eat();
	//overload: methods with same name but different parameters 

	public void sleep() {
		System.out.println("it's late,time to sleep");
	}
}

class Chinese extends Human{
	@Override
	public void eat() {
		System.out.println("Chinese eat with chopsticks");
	}
}

class American extends Human{
	@Override
	public void eat() {
		System.out.println("American like pizza");
	}
}









