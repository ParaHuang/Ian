package day5;

public class Main2 {

	public static void main(String[] args) {
		PS5 ps5 = new PS5();
//		ps5.playGame(); 
		
		XBox xbox = new XBox();
//		xbox.playGame();
		
		Nintendo nintendo = new Nintendo();
		SomeOther some = new SomeOther();
		
		YoungPeople young = new YoungPeople();
		young.haveFun(ps5);
		System.out.println();
		young.haveFun(xbox);
		System.out.println();
		young.haveFun(nintendo);
		System.out.println();
		young.haveFun(some);
//		young.haveFun(ps5, xbox, nintendo);
		
		//polimorphism: one thing shows in different way
		//1 thing:Game Machine
		//differnt way: Ps5,Xbox,Nintindo
		
		///2 essential factor:
		//1.reference type change
		//2.override
		
		
		//reference type change
		//SuperClass reference = new SubClass();
	}

}

class YoungPeople{

	public void haveFun(GameMachine g) {
		System.out.println("young people have fun");
		g.playGame();
	}
	
	/*
	public void haveFun(PS5 g) {
		System.out.println("young people have fun");
		g.playGame();
	}
	
	//overload
	public void haveFun(XBox g) {
		System.out.println("young people have fun");
		g.playGame();
	}
	
	//overload
	public void haveFun(Nintendo g) {
		System.out.println("young people have fun");
		g.playGame();
	}
	
	//overload
	public void haveFun(SomeOther g) {
		System.out.println("young people have fun");
		g.playGame();
	}
	*/

	//if you want to have fun, then you need Ps5,Xbox and Nintendo at the same time
//	public void haveFun(PS5 p,XBox x,Nintendo n) {
//		System.out.println("young people have fun");
//		p.playGame();
//		x.playGame();
//		n.playGame();
//	}
}

class GameMachine{
	public void playGame() {
		System.out.println("play games");
	}
	//overload
	//different parameters: 1. different count  2.different type  3.different order
//	public void playGame(int a,String b) {
//		
//	}
//	public void playGame(String a,int b) {
//		
//	}
}

class PS5 extends GameMachine{
	//Subclass has same method as Superclass
	@Override
	public void playGame() {
		System.out.println("PS5:buy a game CD，connect with TV，there we go");
	}
}

class XBox extends GameMachine{
	//Subclass has same method as Superclass
	@Override
	public void playGame() {
		System.out.println("XBox:connect with TV,choose a game from game store, then play");
	}
}

class Nintendo extends GameMachine{
	@Override
	public void playGame() {
		System.out.println("Nintendo:turn it on，choose a game，playing alone，so nice");
	}
}

class SomeOther extends GameMachine{
	@Override
	public void playGame() {
		System.out.println("SomeOther:~~~~~~~~~");
	}
}
//50 types of GameMachine








