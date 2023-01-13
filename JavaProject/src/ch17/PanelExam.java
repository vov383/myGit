package ch17;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelExam extends JFrame{

	public PanelExam() {
		//Panel에는 컴포넌트 2개 이상 배치할 수 있음, 버튼을 패널에 추가 후
		//패널을 프레임에 붙여 여러 개의 컴포넌트를 처리할 수 있다.
		JPanel p = new JPanel();//패널생성
		
		p.setBackground(Color.red);//패널의 배경색상 설정 //red RED 뭘로 쓰든 상수로 처리
		
		//버튼생성(swing계열은 한글처리 잘됨.)
		JButton button1 = new JButton("버튼1");
		JButton button2 = new JButton("버튼2");
		JButton button3 = new JButton("버튼3");
		JButton button4 = new JButton("버튼4");
		JButton button5 = new JButton("버튼5");
		JButton button6 = new JButton("버튼6");
		
		p.add(button1);
		p.add(button6);//Border 아니고 패널에 버튼추가
		
		//BorderLayout 북쪽에 패널 추가
		add(p, BorderLayout.NORTH);//이게 정석.
//		add(p, "North");//얘는 약식. //둘이 똑같다.
		
		add(button2);//위치 생략하면 Center에 자동배치
		add(button3, "South");
		add(button4, "West");
		add(button5, "East");
		
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	
	
	
	public static void main(String[] args) {
		new PanelExam();
	}
}
