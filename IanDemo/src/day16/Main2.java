package day16;

//the interaction among multiple Threads
public class Main2 {

	public static void main(String[] args) {
		//2.one Thread interrupt the other one
		Thread t1 = new Thread() {
			@Override
			public void run() {
				System.out.println("Thread 1 is gonna sleep");
				try {
					Thread.sleep(Integer.MAX_VALUE);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace(); //print the exception infomation
					System.out.println("the rest task.....");
				}
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for(int i=1 ; i<=10 ; i++) {
					System.out.println("BB"+i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				t1.interrupt();
			}
		};
		
		
		t1.start();
		t2.start();
		
		
	}

}
