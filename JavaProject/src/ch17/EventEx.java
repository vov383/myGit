package ch17;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//이벤트 처리 3대요소 : 1)이벤트 소스, 2)이벤트 처리기(클래스), 3)이벤트 리스너
public class EventEx extends Frame implements WindowListener{//인터페이스여서 implements /have to/
	
	public EventEx() {
		addWindowListener(this);//그동안 new...해서 쓰지않고 
		//WindowListener를 상속받아 쓰면 (this)로도 사용가능
		setSize(300, 300);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new EventEx();
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
