package day4;

public class Main1 {

	public static void main(String[] args) {
		PS5 p = new PS5();
		Nintendo n = new Nintendo();
		XBox x = new XBox();
		
		Polaroid po = new Polaroid();
		GoPro g = new GoPro();
		DigitalCamera d = new DigitalCamera();
		
		YoungPeople Ian = new YoungPeople();
		Ian.haveFun(p);
		Ian.haveFun(n);
		Ian.haveFun(x);
		
		Ian.recordGoodMoments(g);
		Ian.recordGoodMoments(d);
		Ian.recordGoodMoments(po);
		
		OtherCamera oc = new OtherCamera();
		Ian.recordGoodMoments(oc);
	}

}

class YoungPeople{
	public void haveFun(GameMachine g) {
		System.out.println("young people is having fun");
		g.playGames();
	}
	
	public void recordGoodMoments(Camera c) {
		System.out.println("recording....");
		c.takePhoto();
	}
	/*
	public void haveFun(PS5 p) {
		System.out.println("young people is having fun");
		p.playGames();
	}
	public void haveFun(Nintendo n) {
		System.out.println("young people is having fun");
		n.playGames();
	}
	public void haveFun(XBox x) {
		System.out.println("young people is having fun");
		x.playGames();
	}
	public void haveFun(Other o) {
		System.out.println("young people is having fun");
		o.playGames();
	}
	*/
}

abstract class GameMachine{
	public abstract void playGames() ;
}

class PS5 extends GameMachine{
	@Override
	public void playGames() {
		System.out.println("buy a game CD，connect with TV，there we go!");
	}
}

class Nintendo extends GameMachine{
	@Override
	public void playGames() {
		System.out.println("turn it on，choose a game，playing alone，so nice");
	}
}

class XBox extends GameMachine{
	@Override
	public void playGames() {
		System.out.println("connect with TV,choose a game from game store, then play");
	}
}

class Other extends GameMachine{
	@Override
	public void playGames() {
		System.out.println("cxxxxxxx");
	}
}

abstract class Camera{
	public abstract void takePhoto();
}

class Polaroid extends Camera{
	@Override
	public void takePhoto() {
		System.out.println("press the shutter, get an instant photo");
	}
}

class GoPro extends Camera{
	@Override
	public void takePhoto() {
		System.out.println("diving into ocean,let's memorize this beautiful world");
	}
}

class DigitalCamera extends Camera{
	@Override
	public void takePhoto() {
		System.out.println("press the shutter,get an digital picture");
	}
}

class OtherCamera extends Camera{
	@Override
	public void takePhoto() {
		System.out.println("~~~~~~~~~~~~~~`");
	}
}






