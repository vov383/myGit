package ch17;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx1 extends JFrame{

	public FlowLayoutEx1() {
		setTitle("FlowLayout 예제");
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//FlowLayout으로 설정하고 싶어
//		setLayout(new FlowLayout());
		//FlowLayout() 생성자에다가 정렬 옵션을 줄 수도 있다
		setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));//컴포넌트 간 정렬위치와 좌우 간격(pixel), 상하간격(픽셀)
		setLayout(new FlowLayout(FlowLayout.RIGHT, 30, 40));//버튼 배치를 오른쪽정렬
		
		add(new JButton("1"));
		add(new JButton("2"));
		add(new JButton("3"));
		add(new JButton("4"));
		add(new JButton("5"));
	}
	

	public static void main(String[] args) {
		new FlowLayoutEx1();
		//사이즈 줄였다가 늘렸다가 하면 버튼 배치 자동으로 해줌
	}
}
