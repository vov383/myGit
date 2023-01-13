package ch17;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class PaintExam extends JFrame{
	public PaintExam() {
		super("페인트 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(300, 300);
	}

	@Override
	public void paint(Graphics g) {//paint 치고 ctrl space 자동완성
		super.paint(g);//JFrame의 paint()가 실행
		//drawString()매개변수 3개. String과 x, y 좌표값
		g.drawString("hello java", 10, 60);
		g.drawOval(30, 100, 50, 50);
		g.setColor(Color.blue);//색 지정
		g.fillOval(100, 100, 50, 50);//fillOval(x y 좌표 width height) //원형으로 지정된 색 채워
		g.drawRect(100, 200, 60, 60);
		g.setColor(Color.yellow);
		g.fillRect(200, 200, 60, 60);
		System.out.println("paint 호출...");
	}
	
	
	public static void main(String[] args) {
		new PaintExam();
		//문자열을 그림을 그려서 문자처럼 출력해줌
		//그림 그리고
		//색 지정하고
		//색 채우고
	}
}
