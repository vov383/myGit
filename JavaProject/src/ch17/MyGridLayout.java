package ch17;
//0109 과제1
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyGridLayout extends JFrame{

	public MyGridLayout() {
		super("그리드 텍스트필드 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(250, 450);
		setVisible(true);
		
		Container c = getContentPane();
		
		c.setLayout(new GridLayout(4,2)); //4행 2열
		c.add(new JLabel("ID"));
		c.add(new JTextField("hong", 10));
		c.add(new JLabel("비번"));
		c.add(new JPasswordField("****", 10));
		c.add(new JLabel("이메일"));
		c.add(new JTextField("hong@daum.net", 30));
		c.add(new JLabel("hp"));
		c.add(new JTextField("010-1234-5678", 30));
	}
	
	public static void main(String[] args) {
		new MyGridLayout();
	}
}
