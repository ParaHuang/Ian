package day15;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameFrame extends JFrame{
	public static void main(String[] args) {
		GameFrame frame = new GameFrame();
		frame.setVisible(true);
	}
	
	public GameFrame() {
		setSize(500, 400);
		setLocation(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pnl = (JPanel) getContentPane();
		pnl.setLayout(null);
		
		//normal button -> moving button
		NPC npc1 = new NPC("NPC1");
		npc1.setBounds(10, 150, 60, 30);
		pnl.add(npc1);

		NPC npc2 = new NPC("NPC2");
		npc2.setBounds(400, 50, 60, 30);
		pnl.add(npc2);
		
		//Mario in maze
	}
}














