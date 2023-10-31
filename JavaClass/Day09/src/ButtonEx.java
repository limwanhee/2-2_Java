import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEx extends JFrame{
	private JButton btn1, btn2;
	public ButtonEx() {
		setTitle("버튼 예제");
		setLayout(new FlowLayout());
		btn1 = new JButton("전송");
		btn2 = new JButton("취소");
		add(btn1); add(btn2); 
		setSize(300, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		ButtonEx obj = new ButtonEx();

	}

}
