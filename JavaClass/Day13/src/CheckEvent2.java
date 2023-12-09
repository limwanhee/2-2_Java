import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CheckEvent2 extends JFrame implements ItemListener{
	
	JLabel Lb;
	JPanel P1;
	JTextArea Ta;
	JCheckBox Cb1, Cb2, Cb3, Cb4;
	int total = 0;
	public CheckEvent2() {
		
		setTitle("체크박스 이벤트2");
		
		Lb = new JLabel("장바구니에 담을 과일을 선택하세요");
		Ta = new JTextArea();
		Cb1 = new JCheckBox("포도");
		Cb2 = new JCheckBox("사과");
		Cb3 = new JCheckBox("딸기");
		Cb4 = new JCheckBox("바나나");
		
		Cb1.addItemListener(this);
		Cb2.addItemListener(this);
		Cb3.addItemListener(this);
		Cb4.addItemListener(this);
		
		P1 = new JPanel();
		P1.add(Cb1);
		P1.add(Cb2);
		P1.add(Cb3);
		P1.add(Cb4);
				
		add("North", Lb);
		add("Center", Ta);
		add("South", P1);
		
		setSize(400,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		CheckEvent2 ce2 = new CheckEvent2();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		Ta.setText("");
		if(Cb1.isSelected()) {
			Ta.append("<<포도(5천원)>>");
			total+=5000;
		}
		if(Cb2.isSelected()) {
			Ta.append("<<사과(2천원)>>");
			total+=2000;
		}
		if(Cb3.isSelected()) {
			Ta.append("<<딸기(7천원)>>");
			total+=7000;
		}
		if(Cb4.isSelected()) {
			Ta.append("<<바나나3천원)>>");
			total+=3000;
		}
		Ta.append("\n\n 장바구니가격: " +total+"원");
		
	}
}
