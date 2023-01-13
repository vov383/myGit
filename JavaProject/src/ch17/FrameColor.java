package ch17;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class FrameColor extends JFrame{//JFrame import
	
	public FrameColor() throws InterruptedException{
		setVisible(true);
		Container c = getContentPane();//컨테이너 import  //프레임의 컨텐츠 영역처리
		
		for (int i = 0; i < 255; i++) {
			setSize(i*2, i);//프레임 사이즈
			setLocation(i*2, i);//프레임의 좌표
			c.setBackground(new Color(i, 0, 0));//배경색상 설정 
			//rgb 컬러값. ff가 255 
			//빛의 3원색 혼합해서 다양한 색깔 만들어
			Thread.sleep(10);
		}
		for (int i = 0; i < 255; i++) {
			setSize(i*2, i);
			setLocation(i*2, i);
			c.setBackground(new Color(255, i, 0));
			Thread.sleep(10);
		}
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);//윈도우 닫을 시 프로그램 종료
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		new FrameColor();//throws로 익셉션 처리
	}
}
