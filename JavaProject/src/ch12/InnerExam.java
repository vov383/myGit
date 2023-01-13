package ch12;

import java.awt.Frame; //gui 에 쓰이는 프로그램
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class InnerExam extends Frame{ 

	public InnerExam() {
		super("내부 클래스 테스트"); //프레임 제목
		setSize(300,400); //프레임. 윈도우 창 크기값.
		
		setVisible(true); //프레임 보임
//		setVisible(false); //안보임
	}
	
	public static void main(String[] args) {
		InnerExam e = new InnerExam();
		//필요한 기능만 갖다 쓰는ver
		e.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}); 
	}
}
		
//		e.addWindowListener 를 전부 AnonymousInnerClass로 override 하는건 번거로움. 닫기 하나만 구현할 거니까.
//		e.addWindowListener() 생성자 괄호 안에 new 해서 WindowAdapter()를 자동완성
		//하면 내부 익명 클래스로 windowClosing(WindowEvent e)이 overriding 되고 이것만 구현해주면 끝.
//		훨씬 간단하다.
		
		//이벤트 처리 : 사용자의 요청(request)에 시스템이 응답(response)
		//이벤트 3대 요소
		//1) 이벤트 소스 : 이벤트의 대상
		//2) 이벤트 리스너 : 이벤트 관찰자, 감시자
		//3) 이벤트 핸들러 : 이벤트 처리기
		
		//이벤트 처리 한번에 자동완성ver
//		e.addWindowListener(new WindowListener() { //익명InnerClass 활용 자동완성.
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
//				System.exit(0); //프로그램 종료 코드. x표 누르면 닫힌다. 
//				//event처리. 대표적인 무명클래스 기법. gui에 많이 쓰인다.
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
//		});
//		
//	}
//}
