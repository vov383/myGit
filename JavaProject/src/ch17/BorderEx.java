package ch17;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BorderEx extends Frame{
	
	BorderEx(){
		setTitle("BorderLayout 예제");//타이틀 정의. 이렇게도 할 수 있다.
		setSize(600, 400);
		setVisible(true);
		
		Button b1 = new Button("east");
		Button b2 = new Button("west");
		Button b3 = new Button("south");
		Button b4 = new Button("north");
		Button b5 = new Button("center");//BorderLayout은 구역이 5개
		//동서남북을 news라고 함
		
		
		//setLayout(new BorderLayout());//Frame의 기본레이아웃은 BorderLayout
		//setLayout을 생략해도 된다.
		
		//BorderLayout의 각 영역에 컴포넌트를 배치
		add(b1, "East");
		add(b2, "West");
		add(b3, "South");
		add(b4, "North");
		add(b5);
//		add(b5, "Center");//Center는 생략가능
		
		//윈도우 창 닫기
		addWindowListener(new WindowAdapter() {//WindowAdapter()로 익명클래스 구현. windowClosing()만 구현하면 간결하게 끝
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new BorderEx();
	}

}
