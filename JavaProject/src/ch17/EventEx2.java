package ch17;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventEx2 extends JFrame{

	private JButton button1, button2, button3, button4, button5, button6;
	public EventEx2() {
		setLayout(new FlowLayout());//레이아웃 변경
		
		button1 = new JButton("Red");
		button2 = new JButton("Green");
		button3 = new JButton("Blue");
		button4 = new JButton("White");
		button5 = new JButton("Yellow");
		button6 = new JButton("Cyan");
		
		//프레임에 버튼 add()
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
		
		//이벤트 기능 추가. 버튼 클릭시
		//이벤트 핸들러를 외부클래스를 만들어서 생성으로 구현한 것
		button1.addActionListener(new MyColorAction(this, Color.red));//전에 생성한 MyColorAction
		button2.addActionListener(new MyColorAction(this, Color.green));
		button3.addActionListener(new MyColorAction(this, Color.blue));
		button4.addActionListener(new MyColorAction(this, Color.white));
		button5.addActionListener(new MyColorAction(this, Color.yellow));
		button6.addActionListener(new MyColorAction(this, Color.cyan));
		//버튼을 누르면 MyColorAction 클래스에서 구현한 actionPerformed()가 자동 호출됨.
		//매개변수 this는 EventExx2 자신의 객체를 기리키는 것
		//데이터타입으로는 JFrame 타입이다.(JFrame을 상속받았기 때문)
		
		
		setSize(450, 300);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);//현재 창만 닫아줌
	}
	
	public static void main(String[] args) {
		new EventEx2();
	}
}
