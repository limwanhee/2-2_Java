import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RadioButtonEx2 extends JFrame{
	JLabel Lab1, Lab2, Lab3, Lab4;
	JPanel Pan1, Pan2, Pan3;
	JTextField Tf1, Tf2;
	JRadioButton Rb1, Rb2;
	JCheckBox Cb1, Cb2, Cb3, Cb4;
	
	public RadioButtonEx2() {
		setTitle("라디오버튼 예제2");
		setLayout(new BorderLayout());
		
		Lab1 = new JLabel("이름 : ");
		Lab2 = new JLabel("주소 : ");
		Lab3 = new JLabel("성별 : ");
		Lab4 = new JLabel("취미 : ");
		
		Tf1 = new JTextField(10);
		Tf2 = new JTextField(20);
		
		Rb1 = new JRadioButton("남");
		Rb2 = new JRadioButton("여", true);
		
		ButtonGroup grp = new ButtonGroup();
		
		grp.add(Rb1);
		grp.add(Rb2);
		
		Cb1 = new JCheckBox("게임");
		Cb2 = new JCheckBox("등산");
		Cb3 = new JCheckBox("여행");
		Cb4 = new JCheckBox("공부");
		
		Pan1 = new JPanel();
		
		Pan1.add(Lab1);
		Pan1.add(Tf1);
		Pan1.add(Lab2);
		Pan1.add(Tf2);
		
		Pan2 = new JPanel();
		
		Pan2.add(Lab3);
		Pan2.add(Rb1);
		Pan2.add(Rb2);
		
		Pan3 = new JPanel();
		
		Pan3.add(Lab4);
		Pan3.add(Cb1);
		Pan3.add(Cb2);
		Pan3.add(Cb3);
		Pan3.add(Cb4);
		
		add("North", Pan1);
		add("Center", Pan2);
		add("South", Pan3);
		
		setSize(500, 130);
		setVisible(true);
	}

	public static void main(String[] args) {
		RadioButtonEx2 app = new RadioButtonEx2();

	}

}
