import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEvent2_1 extends JFrame implements MouseListener{
	JButton Btn1, Btn2;
	JLabel Lab1;
	
	public MouseEvent2_1() {
		setTitle("마우스 이벤트2_1");
		setLayout(new FlowLayout());
		
		Btn1 = new JButton("버튼1");
		Lab1 = new JLabel("버튼을 클릭해보세요");
		
		Btn2 = new JButton("버튼2");
		
		add(Lab1);
		add(Btn1);
		
		add(Btn2);
		
		Btn1.addMouseListener(this); //버튼1을 마우스 이벤트 리스너에 추가
		Btn2.addMouseListener(this); //버튼2을 마우스 이벤트 리스너에 추가
		
		setSize(300, 200);
		setVisible(true);
	}
	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getSource() == Btn1) {
			Lab1.setText("버튼 1이 클릭 되었습니다");
		}
		if(e.getSource() == Btn2) {
			Lab1.setText("버튼 2가 클릭 렸습니다");
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		Lab1.setText("마우스가 클릭되었습니다");
		Btn1.setForeground(Color.pink);
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		Lab1.setText("마우스가 들어왔습니다");
		Btn1.setBackground(Color.blue);
	}
	@Override
	public void mouseExited(MouseEvent e) {
		Lab1.setText("마우스가 나갔습니다");
		Btn1.setBackground(Color.yellow);
		
	}
	@Override
	public void mouseReleased(MouseEvent e) { // 사용 안함
	
		
	}
	public static void main(String[] args) {
		MouseEvent2_1 f = new MouseEvent2_1();
	}

}
