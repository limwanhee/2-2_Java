import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEvent2 extends JFrame implements MouseListener{
	JButton Btn1;
	JLabel Lab1;
	
	public MouseEvent2() {
		setTitle("마우스 이벤트2");
		setLayout(new FlowLayout());
		
		Btn1 = new JButton("버튼을 동작하는 마우스 이벤트");
		Lab1 = new JLabel("마우스를 동작해보세요");
		
		add(Btn1);
		add(Lab1);
		
		Btn1.addMouseListener(this); //버튼을 마우스 이벤트 리스너에 추가
		
		setSize(300, 200);
		setVisible(true);
	}
	@Override
	public void mousePressed(MouseEvent e) {
		Lab1.setText("마우스가 눌렸습니다");
		Btn1.setForeground(Color.red);
		
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
		MouseEvent2 f=new MouseEvent2();
	}

}
