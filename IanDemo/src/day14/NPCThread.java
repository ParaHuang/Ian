package day14;

import javax.swing.JButton;

public class NPCThread extends Thread{
	private int step = 10;
	private JButton npc;
	
	public NPCThread(JButton npc) {
		this.npc = npc;
	}
	
	@Override
	public void run() {
		//deal with npc location
		while(true) {
			int x = npc.getX();
			int y = npc.getY();
			if(x>=440 || x<=0) {
				step *= -1;
			}
			x+=step;
			npc.setLocation(x, y);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

