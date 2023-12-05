import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextField_ex extends JFrame implements ActionListener{
	JTextField Tf1, Tf2, Tf3; //성명, 학번, 점수의 값을 받아오기
	JLabel Lab1, Lab2, Lab3, Lab4; //성명, 학번, 점수, 결과값을 안내
	JPanel Pan1, Pan2, Pan3; //상중하로 화면 구성
	JButton Btn;
	
	public TextField_ex() {
		setTitle("텍스트필드 예제");
		setLayout(new BorderLayout());
		
		Tf1 = new JTextField(10);
		Tf2 = new JTextField(10);
		Tf3 = new JTextField(10);
		
		Lab1 = new JLabel("성명 : ");
		Lab2 = new JLabel("학번 : ");
		Lab3 = new JLabel("점수를 입력하세요 : ");
		Lab4 = new JLabel("당신의 성적은? ");
		
		Btn = new JButton("확인");
		
		Pan1 = new JPanel();
		Pan2 = new JPanel();
		Pan3 = new JPanel();
		
		Pan1.add(Lab1);
		Pan1.add(Tf1);
		
		Pan1.add(Lab2);
		Pan1.add(Tf2);
		
		Pan2.add(Lab3);
		Pan2.add(Tf3);
		Pan2.add(Btn);
		
		Pan3.add(Lab4);
		
		add("North", Pan1);
		add("Center", Pan2);
		add("South", Pan3);
		
		Btn.addActionListener(this);
		
		setSize(400, 150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int num = Integer.parseInt(Tf3.getText());
		//이름, 학번, 결과 우수한 성적입니다 or 좀 더 노력하세요!
		
		String t1 = Tf1.getText();
		String t2 = Tf2.getText();
		
		if(e.getSource() == Btn) {
			if(num > 90) {
				Lab4.setText(t1 + " " + t2 + " 우수한 성적입니다!");
			}
			else {
				Lab4.setText(t1 + " " + t2 + " 좀 더 노력하세요!");
			}
		}
	}

	public static void main(String[] args) {
		new TextField_ex();

	}

}
