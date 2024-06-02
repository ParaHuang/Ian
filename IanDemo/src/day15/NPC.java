package day15;

import javax.swing.JButton;

public class NPC extends JButton implements Runnable{
	//private String name;
	private int step = 10;
	public NPC(String name) {
//		this.name = name;
		this.setText(name);
		
		/*
		Thread t = new Thread() {
			@Override
			public void run() {
				int y = getY();
				while(true) {
					int x = getX();
					if(x>=440 || x<=0) {
						step *= -1;
					}
					x+=step;
					setLocation(x, y);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		*/
		Thread t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		int y = getY();
		while(true) {
			int x = getX();
			if(x>=440 || x<=0) {
				step *= -1;
			}
			x+=step;
			setLocation(x, y);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}








