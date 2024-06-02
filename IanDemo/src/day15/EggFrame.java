package day15;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

//GUI:graphic user interface
public class EggFrame extends JFrame{
	public static void main(String[] args) {
		new EggFrame().setVisible(true);
	}

	public EggFrame() {
		setSize(500, 520);
		setLocation(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pnl = (JPanel) getContentPane();
		pnl.setLayout(new GridLayout(10, 10));
		
		for(int i=1 ; i<=100 ; i++) {
			Egg egg = new Egg();
			//JPanel egg = new JPanel();
//			egg.setBorder(new TitledBorder(i+""));
			pnl.add(egg);
		}
		
	}
}
