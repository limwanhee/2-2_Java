import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame{
	private JButton btn1, btn2, btn3, btn4, btn5;
	
	public BorderLayoutEx() {
		setTitle("BorderLayout 예제");
		//Borderlayout (int hGap,int vGap)
		setLayout(new BorderLayout(30,20));
		
		btn1 = new JButton("가");
		btn2 = new JButton("나");
		btn3 = new JButton("다");
		btn4 = new JButton("라");
		btn5 = new JButton("마");
		
		add("East", btn1);
		add("West", btn2);
		add("North", btn3);
		add("South", btn4);
		add("Center", btn5);
		
		setSize(300, 200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		BorderLayoutEx obj = new BorderLayoutEx();

	}

}
