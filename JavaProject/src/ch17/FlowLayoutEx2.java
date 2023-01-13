package ch17;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutEx2 extends JFrame{

	JPanel jp;//패널변수 선언.
	JButton jb1, jb2, jb3, jb4, jb5, jb6;//버튼 변수도 선언
	
	public FlowLayoutEx2() {
		super("FlowLayout 예제2");//super(String)해서 타이틀 설정. setTitle()과 동일
		jp = new JPanel();//패널 생성
		jb1 = new JButton("버튼1");
		jb2 = new JButton("버튼2");
		jb3 = new JButton("버튼3");
		jb4 = new JButton("버튼4");
		jb5 = new JButton("버튼5");
		jb6 = new JButton("버튼6");
		
		jp.add(jb1);//패널에 버튼 붙여
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		jp.add(jb6);
		
//		add(jp, "South");
		jp.setLayout(new FlowLayout());
		add(jp);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//이게 정식문법. JFrame.은 생략 가능
		
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx2();
	}
}
