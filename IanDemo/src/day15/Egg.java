package day15;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class Egg extends JPanel implements Runnable{
	private Random random = new Random();
	private int speed;
	
	public Egg() {
		speed = random.nextInt(2000);
		Thread t = new Thread(this);
		t.start();
	}
	
	//override this method to define your own JPanel look
	//this method will be called automatically when the JPanel is updated
	@Override
	protected void paintComponent(Graphics g) {
		// think about g as a pen
		super.paintComponent(g);
//		g.drawLine(0, 0, 20, 20);
		int red = random.nextInt(256);
		int green = random.nextInt(256);
		int blue = random.nextInt(256);
		g.setColor(new Color(red, green, blue));
		g.fillOval(0, 0, getWidth(), getHeight());
	}

	@Override
	public void run() {
		while(true) {
			updateUI();
			try {
				Thread.sleep(speed);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}















