package ch17;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CardEx extends JFrame{
	
	//사용할 도구들을 선언해놓고 코딩하는것이 좋은 습관이다.
	CardLayout card;
	Container con;
	
	
	public CardEx() {
		super("CardLayout 예제");
		card = new CardLayout();
		con = getContentPane();//프레임의 컨텐츠(con) 영역
		
		setLayout(card);//카드레이아웃으로 변경
		JPanel[] pan = new JPanel[5];//패널 배열 생성
		Color[] color = {Color.red, Color.yellow, Color.green, Color.blue, Color.cyan};
		
		for (int i = 0; i < pan.length; i++) {
			pan[i] = new JPanel();//패널을 for문 개수만큼 생성
			pan[i].setBackground(color[i]);//패널의 배경색상 설정. 배열 돌아가면서 채워짐
			add("card"+i, pan[i]);
			
			//각각의 패널에 마우스 이벤트 추가
			pan[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					card.next(con);//다음 화면으로 이동. 컨텐츠의 con
//					card.previous(con);//이전 화면으로 이동
				}
			});
			
			setSize(300, 300);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	}
	
	
	public static void main(String[] args) {
		new CardEx();
		//CardLayout 특징. 한 페이지에 다 보여줌. 카드처리
		//마우스를 클릭할 때마다 다음장 나오면서 색상 바뀜.
		//배열화한 색상 순서대로
	}

}
