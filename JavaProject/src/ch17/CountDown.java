package ch17;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CountDown extends JFrame{

	private JLabel label;//자바 테두리처럼 flame;
	class MyThread extends Thread{
		@Override
		public void run() {
			for (int i = 10; i >= 0 ; i--) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				label.setText(i + "");
			}
			System.exit(0);//카운트다운 끝나면 자동종료
		
		
		}
	}//내부 클래스
	
	public CountDown() {
		setTitle("카운트다운");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label = new JLabel("start");
		label.setFont(new Font("Serif", Font.BOLD, 100));
		add(label);
		(new MyThread()).start();//객체를 괄호 안에 new해서 참조변수 없이 처리
		setVisible(true);//화면 보이게 하는 메서드
		
		
	}
	
	public static void main(String[] args) {
		new CountDown();//객체생성
	}
	//Thread 는 Gui 프로그램 돌릴 때 많이 사용
	//나중에 봐봐야 알듯??
	
	
}
