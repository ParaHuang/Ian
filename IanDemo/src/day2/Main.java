package day2;

public class Main {

	public static void main(String[] args) {
		//Type t = new Type();//after new is using the constructor
		Human h = new Human("Jack",18);
		h.eat();
		h.sleep();
		
		System.out.println("==============");
		Chinese c = new Chinese();
		c.eat();
		c.sleep();
		
		System.out.println("==============");
		American a = new American("Tom");
		a.eat();
		a.sleep();
	}

}

