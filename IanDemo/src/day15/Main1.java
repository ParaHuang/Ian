package day15;

public class Main1 {

	public static void main(String[] args) {
		//3rd way to use Thread: use a Runnable object to deal with the run method
		
		
		
		MyRun myRun = new MyRun();
		//2.initialize Runnable object , use it as argument when we initialize a Thread object
		Thread t = new Thread(myRun);
		t.start();
	}

}

//1.define a class, to implements Runnable interface
class MyRun implements Runnable{

	@Override
	public void run() {
		for(int i=1 ; i<=10 ; i++) {
			System.out.println("A"+i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}






