package day16;

//the interaction among multiple Threads
public class Main1 {

	public static void main(String[] args) {
		//1.how long does one Thread execute depends on the other Thread
		Thread t1 = new Thread() {//NPC
			@Override
			public void run() {
				for(int i=1 ;  ; i++) {
					System.out.println("AA"+i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};

		Thread t2 = new Thread() {//Character
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
			}
		};
		
		t1.setDaemon(true);
		
		t1.start();
		t2.start();
		
	}

}










