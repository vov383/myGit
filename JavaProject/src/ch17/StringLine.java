package ch17;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

public class StringLine extends JApplet{
/*
지금은 잘 안쓰이는 Applet이 있어. 한번 해보자
JApplet은 Applet의 확장판
애플릿 뷰어와 웹브라우저와 함께 쓰임
게임 및 다양한 그래픽 구사할 수 
현재 HTML 5 기능이 우월
Applet은 사라지는 추세
APPlet의 라이프사이클.
	init() -> start() -> stop() -> destroy()
init()만 필수처리하면
나머지는 자동으로 처리됨
특정 웹브라우저 페이지 이동 및 강제종료시킬 때 간혹 쓰인다.
*/
	@Override
	public void init() {//애플릿 초기화
			getContentPane().setBackground(new Color(255,255,255));//배경색상 설정
			setSize(300, 300);//애플릿 화면사이즈 설정
	}
	@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.setColor(Color.BLUE);//색상설정
			g.drawLine(205, 50, 30, 160);//선그리기 drawLine(x1, y1, x2, y2)
			g.setColor(Color.RED);
			g.drawString("Red String", 10, 50);
			g.setColor(Color.GREEN);
			g.drawString("Green String", 10, 80);
			g.setColor(Color.blue);
			g.drawString("Blue String", 10, 110);
			
	}
	
	public static void main(String[] args) {
		new StringLine();
	}
		
}

