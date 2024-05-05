package day14;

//Thread -> File operation-> Regular Expression
public class Main1 {

	public static void main(String[] args) throws InterruptedException {
//		Thread
		for(int i=1 ; i<=10 ; i++) {
			System.out.println("A"+i);
			Thread.sleep(200);//millisecond
		}

		for(int i=1 ; i<=10 ; i++) {
			System.out.println("B"+i);
			Thread.sleep(200);
		}
	}

}

