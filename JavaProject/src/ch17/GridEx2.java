package ch17;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridEx2 extends JFrame{

	public GridEx2() {
		super("GridLayout 예제2");
		
		setLayout(new GridLayout(3, 3));
		
		for (int i = 0; i < 9; i++) {//for()문으로 간단히 그리드래이아웃 구현
			JButton button = new JButton("button"+(i+1));
			add(button);
		}
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	
	public static void main(String[] args) {
		
		new GridEx2();
	}
	
	
	
	
}
