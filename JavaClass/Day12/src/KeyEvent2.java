import java.awt.Color;
import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class KeyEvent2 extends JFrame implements KeyListener{
	JButton Btn;
	
	public KeyEvent2() {
		setTitle("키보드 이벤트2");
		setLayout(null);
		
		Btn = new JButton("버튼입니다");
		Btn.setLocation(50, 30);
		Btn.setSize(120, 30);
		Btn.setFocusable(false);
		
		add(Btn);
		addKeyListener(this);
		setSize(300, 200);
		setVisible(true);
		requestFocus(); // 키 이벤트를 받을 컴포넌트를 강제로 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {}

	@Override
	public void keyReleased(KeyEvent e) {
		int keyCode = e.getKeyCode();
		switch (keyCode) {
		case KeyEvent.VK_UP: 
			Btn.setLocation(Btn.getX(), Btn.getY() - 10);
			break;
			
		case KeyEvent.VK_DOWN:
			Btn.setLocation(Btn.getX(), Btn.getY() + 10);
			break;
		
		case KeyEvent.VK_LEFT:
			Btn.setLocation(Btn.getX() - 10, Btn.getY());
			break;
			
		case KeyEvent.VK_RIGHT:
			Btn.setLocation(Btn.getX() + 10, Btn.getY());
			break;
		
		case KeyEvent.VK_F1:
			Btn.setBackground(Color.pink);
			break;
		
		case KeyEvent.VK_F2:
			Btn.setBackground(Color.yellow);
			break;
		}
		
	}

	public static void main(String[] args) {
		KeyEvent2 f = new KeyEvent2();

	}
}
