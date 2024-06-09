package day16;

//the interaction among multiple Threads
public class Main3 {

	public static void main(String[] args) {
		//3.one Thread join into the other one
		
		//Thread 1:download picture
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for(int i=1 ; i<=100 ; i++) {
					System.out.println("downloading picutre: "+i+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		//Thread 2:watch picture
		Thread t2 = new Thread() {
			@Override
			public void run() {
				System.out.println("ready to watch picture");
				try {
					t1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("good picture");
			}
		};
		
		t1.start();
		t2.start();		
	}

}





