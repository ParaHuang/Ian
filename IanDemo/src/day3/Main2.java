package day3;

public class Main2 {

	public static void main(String[] args) {
		//instantiate:
		//1.
		//Type name = new Type();
		
		//2.Reference transformation
		//SuperClass name = new SubClass();
		/*
		Human c = new Chinese();
		c.eat();
		
		Human a = new American();
		a.eat();
		*/
		//Chinese x = new Human();			//wrong
		
		Company c = new Company();
		
		Chinese chinese = new Chinese();
		American american = new American();
		Indian indian = new Indian();
		
		c.party(chinese);
		System.out.println();
		c.party(american);
		System.out.println();
		c.party(indian);
		System.out.println();
		
		//ch:reference 
		//new Xxxx():object
		Human ch = new Chinese();
		ch.eat();	
		ch.sleep();
//		ch.kungFu();	//wrong，because Human can't do kungFu
	}

}

//company
//throw party.everybody can join party, they eat in party,then they go back to sleep
class Company {
	public void party(Human h) {
		System.out.println("party time");
		h.eat();
		System.out.println("party's over");
		h.sleep();
	}
	/*
	public void party(Chinese c) {
		System.out.println("party time");
		c.eat();
	}

	public void party(American a) {
		System.out.println("party time");
		a.eat();
	}

	public void party(Indian i) {
		System.out.println("party time");
		i.eat();
	}
	*/
}


abstract class Human{
	//eat is important,but how to eat is not
	public abstract void eat();
	
	public void sleep() {
		System.out.println("it's late, time to sleep");
	}
}

class Chinese extends Human{

	//if we don't override abstract method, then we just inherit it
	@Override
	public void eat() {
		System.out.println("Chinese eat with chopsticks");
	}
	
	public void kungFu() {
		System.out.println("Chinese can kungfu");
	}
}

class American extends Human{
	@Override
	public void eat() {
		System.out.println("American like pizza");
	}
}

class Indian extends Human{
	@Override
	public void eat() {
		System.out.println("Indian like curry");
	}
}













