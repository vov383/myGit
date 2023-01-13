package ch17;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaEx extends JFrame{

	private JTextField tf = new JTextField(20);
	private JTextArea ta = new JTextArea(6, 20);//6행 20열의 입력창 생성
	
	public TextAreaEx() {
		super("TextArea 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(250, 200);
		setVisible(true);
		
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		c.add(new JLabel("입력 후 <Enter>키를 입력하세요"));
		c.add(tf);
		c.add(new JScrollPane(ta));
		//TextArea는 ScrollPane과 함께 쓴다. 이 안에 TextArea를 집어넣는 것
		//메모장처럼 여러줄을 쓰게되면 스크롤바를 만들어줌.
		//웹은 이렇게 안함. //어플리케이션에서 사용하는 방식.
		
		tf.addActionListener(new ActionListener() {
			//자동 오버라이드
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();//텍스트필드 안에 있는 값을 가져와. Object type. 타입 캐스팅
				ta.append(t.getText() + "\n");//텍스트필드의 문자열을 TextArea영역으로 가져옴
				t.setText("");//현재 TextField에 입력한 내용 지우기.
						
			}
		});//익명클래스 //이벤트 처리
		
	}
	
	
	
	public static void main(String[] args) {
		new TextAreaEx();
/*
아무거나 
입력하면 
밑으로 
내려가는모습
엔터할 때마다 줄바꿈
계속 입력하면 스크롤바 생겨		
*/
		  
		 
	}
}
