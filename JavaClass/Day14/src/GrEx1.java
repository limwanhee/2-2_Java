import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GrEx1 extends JFrame{
	public GrEx1() {
		setTitle("문자열 출력하기");
		
		MyPanel pan = new MyPanel();
		add("Center", pan);
		
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	class MyPanel extends JPanel{
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawString("drawString()을 이용한 문자열 출력", 50, 100);
		}
	}
	public static void main(String[] args) {
		new GrEx1();

	}

}
