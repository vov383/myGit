package ch17;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextFieldEx extends JFrame{

	public TextFieldEx() {
		super("텍스트필드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame. 하는것이 정식문법. 안해도 됨
		setSize(300, 500);
		setVisible(true);
		
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		c.add(new JLabel("이름"));
		c.add(new JTextField(20));//텍스트 필드의 길이 20
		c.add(new JLabel("학과"));
		c.add(new JTextField("컴퓨터공학과", 20));//매개변수 2개 쓰면? 기본 String값과 길이값 지정
		c.add(new JLabel("주소"));
		c.add(new JTextField("서울시 ...", 20));
		c.add(new JLabel("비번"));
		c.add(new JPasswordField(20));//자동으로 비밀번호 가려주는 처리
		
	}
	
	
	
	
	public static void main(String[] args) {
		new TextFieldEx();
		//음 왜 한줄씩 안나왔을까..... 이상하네... 
	}
}
