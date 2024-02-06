package day3;

public class Main1 {

	public static void main(String[] args) {
		Animal a = new Animal(10);
		a.breath();
		
		Fish f = new Fish();
		f.swim();
		f.breath();
		
		Bird b = new Bird();
		b.fly();
		b.breath();
		
		Shark s = new Shark();
		s.hunt();
		s.swim();
		s.breath();
	}

}

class Animal{
	public Animal(int x) {
		
	}
//	public Animal() {}
	
	public void breath() {
		System.out.println("animal--breath");
	}
}

class Fish extends Animal{
	public Fish() {
		super(10);
	}
	public void swim() {
		System.out.println("Fish--swim");
	}
}

class Bird extends Animal{
	public Bird() {
		super(2);
	}
		
	public void fly() {
		System.out.println("Bird--fly");
	}
}

class Shark extends Fish{
	public void hunt() {
		System.out.println("Shark--hunt");
	}
}
















