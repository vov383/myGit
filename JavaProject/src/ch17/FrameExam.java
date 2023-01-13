package ch17;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
//awt : java + c 개발(없어지는 추세)
//swing : awt 향상시킨 버전, java로만 개발, 플랫폼에 동일한 ui 제공
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameExam {

	public static void main(String[] args) {
		Frame f = new Frame("프레임 테스트");//프레임 생성
		f.setSize(200, 300);//프레임 사이즈 설정
		f.setVisible(true);//프레임을 화면에 표시
		
//		f.addWindowListener(new WindowListener() {//WindowListener 는 감시자. 얘는 인터페이스라서 미구현 메서드 전부 만들어줌
//			
//			@Override
//			public void windowOpened(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowIconified(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowDeiconified(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowDeactivated(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowClosing(WindowEvent e) {
//				//프로그램 종료
//				System.exit(0);//닫기기능 구현 
//				//아무 숫자나 써도 상관없지만 의미있게 쓸 때는 
//				//정상종료 : 0
//				//비정상종료 : -1
//				//안쓰는 코드를 전부 오버라이딩하는것은 코드 낭비
//			}
//			
//			@Override
//			public void windowClosed(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowActivated(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//		});//끝에 ;(세미콜론)은 익명클래스
		
		//WindowAdapter()를 쓰면 코드가 간결해짐. 효과는 같다.
		f.addWindowListener(new WindowAdapter() {//얘는 추상클래스. 자동으로 구현되는거 없어.
			//필요한 기능만 오버라이딩
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
