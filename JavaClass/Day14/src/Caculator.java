import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Caculator extends JFrame implements ActionListener{
	JButton b01,b02,b03,b04,b05,b06,b07,b08,b09,b10,b11,b12,b13,b14,b15,b16,b17; 
	JPanel p1;
	JLabel Lb;
	int num_st = 1;
	double d1, d2, d3;
	int op = 0;
	public Caculator() {
		setTitle("계산기"); 
		setLayout(new BorderLayout());
		
		Lb = new JLabel("0", JLabel.RIGHT); 
		Lb.setPreferredSize(new Dimension(30, 30)); //계산했을때 값 보여주는 공간과 숫자 버튼들 영역 크기 정하기
		
		p1 = new JPanel();
		b01 = new JButton("1");b02 = new JButton("2");b03 = new JButton("3");b04 = new JButton("4");
		b05 = new JButton("5");b06 = new JButton("6");b07 = new JButton("7");b08 = new JButton("8"); // " "안에 있는 이름 가지고 버튼 변수마다 객체 생성
		b09 = new JButton("9");b10 = new JButton("0");b11 = new JButton(".");b12 = new JButton("+");
		b13 = new JButton("-");b14 = new JButton("*");b15 = new JButton("/");b16 = new JButton("C");
		b17 = new JButton("=");
		
		b01.addActionListener(this);b02.addActionListener(this);b03.addActionListener(this);
		b04.addActionListener(this);b05.addActionListener(this);b06.addActionListener(this);
		b07.addActionListener(this);b08.addActionListener(this);b09.addActionListener(this); //버튼 누르면 ActionListener가 인식 하기 위해 넣어야 하는 문장들
		b10.addActionListener(this);b11.addActionListener(this);b12.addActionListener(this);
		b13.addActionListener(this);b14.addActionListener(this);b15.addActionListener(this);
		b16.addActionListener(this);b17.addActionListener(this);
		
		p1.setLayout(new GridLayout(4, 4)); //패널 4 * 4 크기로 그리드 레이아웃으로 만들고
		p1.add(b02);p1.add(b03);p1.add(b04);p1.add(b05);p1.add(b06);p1.add(b07);p1.add(b08);p1.add(b09);p1.add(b10);p1.add(b01);
		p1.add(b11);p1.add(b16);p1.add(b12);p1.add(b13); p1.add(b14); p1.add(b15); //총 15개의 버튼을 패널1에 추가 
		add("North",Lb); add("Center",p1); add("South",b17); //윈도우 창 위쪽엔 라벨(텍스트) 추가, 중간엔 패널1(버튼들 있는 패널) 맨 아래엔 17번 버튼(=) 추가
		
		setSize(200, 210); setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
		@Override
		public void actionPerformed(ActionEvent e) {
			String s = Lb.getText(); //s라는 문자열 변수는 라벨에 있는 문자 가져오기
			if(e.getSource() == b10) { //숫자 0 버튼을 눌렀으면
				if(num_st > 0) { // 만약에 초기 화면이라면
					num_st = 1; // 초기 화면으로 계속 설정
					Lb.setText("0"); // 텍스트는 0으로 설정
			}
			else { // 아니면 
				Lb.setText(s+"0"); // 버튼에 맞게 누른 숫자 출력
			}
		}
		if(e.getSource() == b01) { // 버튼을 눌렀는데 숫자 1 버튼이면
			if(num_st > 0) { // 초기 화면이라면
				num_st = 0; // 초기 화면 아니라고 변수 설정 
				Lb.setText("1"); // 라벨에 1 추가
			}
			else {// 초기화면이 아니라면
				Lb.setText(s+"1"); // 지금 라벨에 숫자 1 추가
			}
		}
		if(e.getSource() == b02) { // 이하 동문
			if(num_st>0) {
				num_st = 0; 
				Lb.setText("2");
			}
			else {
				Lb.setText(s+"2");
			}
		}
		if(e.getSource() == b03) {
			if(num_st>0) {
				num_st = 0; 
				Lb.setText("3");
			}
			else {
				Lb.setText(s+"3");
			}
		}
		if(e.getSource() == b04) {
			if(num_st > 0) {
				num_st = 0; 
				Lb.setText("4");
			}
			else {
				Lb.setText(s+"4");
			}
		}
		if(e.getSource() ==b05) {
			if(num_st > 0) {
				num_st = 0; 
				Lb.setText("5");
			}
			else {
				Lb.setText(s+"5");
			}
		}
		if(e.getSource() == b06) {
			if(num_st > 0) {
				num_st = 0; 
				Lb.setText("6");
			}
			else {
				Lb.setText(s+"6");
			}
		}
		if(e.getSource() == b07) {
			if(num_st > 0) {
				num_st = 0; 
				Lb.setText("7");
			}
			else {
				Lb.setText(s+"7");
			}
		}
		if(e.getSource() == b08) {
			if(num_st > 0) {
				num_st = 0; 
				Lb.setText("8");
			}
			else {
				Lb.setText(s+"8");
			}
		}
		if(e.getSource() == b09) {
			if(num_st > 0) {
				num_st = 0; 
				Lb.setText("9");
			}
			else {
				Lb.setText(s+"9");
			}
		}
		if(e.getSource() == b11) {
			if(num_st > 0) {
				num_st = 0; 
				Lb.setText("0.");
			}
			else {
				Lb.setText(s+".");
			}
		}
		if(e.getSource() == b16) { //"C" 버튼 누르면 
			Lb.setText("0"); 
			num_st = 1; // 0으로 만들고 초기 화면 셋팅
			op = 0; 
		}
		if(e.getSource() == b12) { // "=" 버튼 눌렀으면
			num_st = 1; // 초기 화면으로 셋팅
			op = 1; 
			d1 = Double.parseDouble(Lb.getText()); // 텍스트를 double형으로 변환해서 출력(혹시나 계산한 값이 소수면 소수로 출력해야하니깐)
		}
		if(e.getSource() == b13) {// 이하 동문
			num_st = 1; 
			op = 2; 
			d1 = Double.parseDouble(Lb.getText());
		}
		if(e.getSource() == b14) {
			num_st = 1; 
			op = 3; 
			d1 = Double.parseDouble(Lb.getText());
		}
		if(e.getSource() == b15) {
			num_st = 1; 
			op = 4; 
			d1 = Double.parseDouble(Lb.getText());  
		}
		if(e.getSource() == b17) { // d1에 저장된 숫자와 상호작용해서 값을 위에 써준다
			num_st = 1; 
			d2 = Double.parseDouble(Lb.getText());
			
			if(op == 1) { //각 op번호에 따라 +, -, *, / 하게 만듦
				d3 = d1 + d2;
			}
			else if(op == 2) {
				d3 = d1 - d2;
			}
			else if(op == 3) {
				d3 = d1 * d2;
			}
			else if(op == 4) {
				d3 = d1 / d2;
			}
			Lb.setText(""+d3);
		}
	}
	public static void main(String[] args) {
		Caculator obj = new Caculator();
	}

}
