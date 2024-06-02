package day14;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class MyClock extends JFrame{

	public static void main(String[] args) {
		MyClock clock = new MyClock();
		clock.setVisible(true);
	}
	int step = 10;
	public MyClock() {
		setSize(500, 400);
		setLocation(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pnl = (JPanel) getContentPane();
		pnl.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setFont(new Font("",Font.BOLD,30));
		label.setBounds(10, 300, 360, 40);
		pnl.add(label);
		
		JButton npc1 = new JButton("NPC1");
		npc1.setBounds(10, 150, 60, 30);
		pnl.add(npc1);
		
		JButton npc2 = new JButton("NPC2");
		npc2.setBounds(400, 50, 60, 30);
		pnl.add(npc2);
		
		
		NPCThread nt1 = new NPCThread(npc1);
		nt1.start();//npc1
//
		NPCThread nt2 = new NPCThread(npc2);
		nt2.start();//npc2
		
		
		
		/*
		Thread t2 = new Thread() {
			@Override
			public void run() {
				while(true) {
					int x = npc1.getX();
					int y = npc1.getY();
					if(x>=440 || x<=0) {
						step *= -1;
					}
					x+=step;
					npc1.setLocation(x, y);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		t2.start();
		*/
		
		
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				while(true) {
					Date date = new Date();//get the current time
					int year = date.getYear()+1900;
					int month = date.getMonth()+1;
					int day = date.getDate();
					int hour = date.getHours();
					int min = date.getMinutes();
					int sec = date.getSeconds();
					String time = year+"-"+month+"-"+day+" "+hour+":"+min+":"+sec;
					label.setText(time);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		t1.start();
	}
	
}











