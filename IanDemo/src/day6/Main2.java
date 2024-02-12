package day6;


public class Main2 {

	public static void main(String[] args) {
		PS5 ps5 = new PS5();
		XBox xbox = new XBox();
		Nintendo nintendo = new Nintendo();
		
		YoungPeople young = new YoungPeople();
		young.haveFun(ps5);
		System.out.println();
		young.haveFun(xbox);
		System.out.println();
		young.haveFun(nintendo);
		

		System.out.println();
		System.out.println();
		
		Polaroid p = new Polaroid();
		GoPro g = new GoPro();
		DigitalCamera d = new DigitalCamera();
		young.recordGoodMoments(p);
		System.out.println();
		young.recordGoodMoments(g);
		System.out.println();
		young.recordGoodMoments(d);

		System.out.println();
		System.out.println();
		
		CellPhone cell = new CellPhone();
		young.haveFun(cell);
		young.recordGoodMoments(cell);
	}

}

class YoungPeople{

	public void haveFun(GameMachine g) {
		System.out.println("young people have fun");
		g.playGame();
	}
	public void recordGoodMoments(Camera c) {
		System.out.println("recording....");
		c.takePhoto();
	}

}

interface GameMachine{
	void playGame();
}

class PS5 implements GameMachine{
	@Override
	public void playGame() {
		System.out.println("PS5:buy a game CD，connect with TV，there we go");
	}
}

class XBox implements GameMachine{
	@Override
	public void playGame() {
		System.out.println("XBox:connect with TV,choose a game from game store, then play");
	}
}

class Nintendo implements GameMachine{
	@Override
	public void playGame() {
		System.out.println("Nintendo:turn it on，choose a game，playing alone，so nice");
	}
}


interface Camera{
	void takePhoto();
}

class Polaroid implements Camera{
	@Override
	public void takePhoto() {
		System.out.println("press the shutter, get an instant photo");
	}
}

class GoPro implements Camera{
	@Override
	public void takePhoto() {
		System.out.println("diving into ocean,let's memorize this beautiful world");
	}
}

class DigitalCamera implements Camera{
	@Override
	public void takePhoto() {
		System.out.println("press the shutter,get an digital picture");
	}
}

class CellPhone implements GameMachine,Camera{

	@Override
	public void playGame() {
		System.out.println( "take my phone out, login, play some online games with my teammates");
	}

	@Override
	public void takePhoto() {
		System.out.println("take my phone out, take a picture that I can watch it everyday");
	}
	
}

class A{}
class B{}
class C extends A{}		//you can only directly extends from one single SuperClass: single extends

interface D{}
interface E{}
class F implements D,E{}	//you can implements multiple interfaces at the same time : multiple implements










