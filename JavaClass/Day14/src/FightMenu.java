import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class FightMenu extends JFrame implements ActionListener{
	JMenuBar mbar;
	JMenu Fight, Move;
	JMenuItem Gun, Bomb, Laser, Forward, Backward;
	JTextField Tf;
	
	
	public FightMenu() {
		setTitle("메뉴 이벤트");
		
		mbar = new JMenuBar();
		setJMenuBar(mbar);
		
		Fight = new JMenu("공격");
		Move = new JMenu("이동");
		
		Gun = new JMenuItem("총");
		Bomb = new JMenuItem("폭탄");
		Laser = new JMenuItem("레이저");
		Forward = new JMenuItem("전진");
		Backward = new JMenuItem("후진");
		
		Tf = new JTextField(20);
		
		Fight.add(Gun);
		Fight.add(Bomb);
		Fight.add(Laser);
		
		Move.add(Forward);
		Move.add(Backward);
		
		mbar.add(Fight);
		mbar.add(Move);
		
		Gun.addActionListener(this);
		Laser.addActionListener(this);
		Bomb.addActionListener(this);
		Forward.addActionListener(this);
		Backward.addActionListener(this);
		
		add("South", Tf);
		
		setSize(300, 200);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == Gun) {
			Tf.setText("탕탕탕");
		}
		
		if(e.getSource() == Bomb) {
			Tf.setText("쿠과광");
		}
		if(e.getSource() == Laser) {
			Tf.setText("찌이~~~~~~~~잉");
		}
		if(e.getSource() == Forward) {
			Tf.setText("전진합니다");
		}
		if(e.getSource() == Backward) {
			Tf.setText("후진합니다");
		}
		
		
	}

	public static void main(String[] args) {
		new FightMenu();

	}

}
