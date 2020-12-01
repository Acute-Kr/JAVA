import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ex extends JFrame {

	private Mypanel panel = new Mypanel();
	
	public ex() {
		setTitle("예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(250,200);
		setVisible(true);
	}
	
	class Mypanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString(" 자바 우웩",30,30);
			g.setColor(Color.blue);
			g.drawString("오우씌엣", 60, 60);
		}
	}
	
	public static void main(String [] args) {
		new ex();
	}

	
}
