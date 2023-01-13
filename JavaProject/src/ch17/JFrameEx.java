package ch17;

import javax.swing.JFrame;

public class JFrameEx extends JFrame{

	//gui 코드를 main 안에 작성하기보다는 기본 생성자에 작성하는 것이 좋다.
	//main에서는 생성자 호출만 하면 됨
	public JFrameEx() {
		super("JFrame 예제");//제목처리
		setSize(300, 200);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new JFrameEx();
		//JFrame 은 닫기 기능 기본으로 구현됨
	}
}
