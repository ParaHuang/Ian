package day14;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread() {
			@Override
			public void run() {
				//whatever you want Thread to execute automatically, you write here
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
		};

		Thread t2 = new Thread() {
			@Override
			public void run() {
				//whatever you want Thread to execute automatically, you write here
				for(int i=1 ; i<=10 ; i++) {
					System.out.println("B"+i);
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		
		t1.start();
		t2.start();
	}

}













