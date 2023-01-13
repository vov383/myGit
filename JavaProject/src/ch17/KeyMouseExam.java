package ch17;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JApplet;
/*
MouseListener : 마우스 이벤트 처리를 위한 인터페이스
MouseMotionListener : 마우스 이동 이벤트 처리를 위한 인터페이스
KeyListener : 키보드 이벤트 처리를 위한 인터페이스
 */

public class KeyMouseExam extends JApplet implements MouseListener, MouseMotionListener, KeyListener{

	private int x,y;//이미지 출력할 x, y좌표값
	private int width, height;//이미지 가로, 세로 사이즈
	private Image img;//java에서 이미지 다루는 객체
	private boolean flag = false;//이미지가 처음 실행할 땐 안 보이게 false처리. 나중에 조건에 따라 보이게 true할 것
	
	@Override
	public void init() {
		setSize(300, 300);
		//이미지 객체 사용할 때 정형화된 방법
		img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("car.gif"));
		
		this.addMouseListener(this);//현재객체(키마우스)에 마우스 이벤트 기능을 추가(중요코드)
		this.addMouseMotionListener(this);
		this.addKeyListener(this);//현재 클래스에 키이벤트 기능 추가
		
		setFocusable(true);//키입력받을 수 있도록
		requestFocus();
	}	
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		//이미지 가로세로 길이값 가져와
		width = img.getWidth(null);//null처리 해줘야
		height = img.getHeight(null);
		System.out.println(width +","+ height);
		if(flag) {
			g.drawImage(img, x, y, this);//여기 듣다 놓쳤는데 따라잡았네
		}
	}
	@Override
	//컴퍼넌트 상에서 마우스 버튼을 클릭했을때(==눌렀다가 놓을 때) //(누르고 있을 때 말고)
	public void mouseClicked(MouseEvent e) {
		flag=true;//클릭할 때 true로 해서 그림 보이게 함
		x = e.getX();
		y = e.getY();
		repaint();//그래픽 갱신 요청 => paint()가 호출됨
		//애니메이션 그릴 때 정지그림에서 자꾸 리패인팅 리패인팅 하는 것
		//화면갱신 요청을 받으면 update()를 호출하고 update()는 화면을 지운 후에 paint()를 호출한다
	}@Override
	//마우스를 드래그 할 때
	public void mouseDragged(MouseEvent e) {
		System.out.println("mouse drag : x:" + x +", y:" +y);//여기 듣다가 또 놓쳣네. 그래도 맞게 유추해서 혼자 채웠음.
	}
	
	@Override
	//마우스가 이동했지만 버튼이 작동않는 경우에 호출
	public void mouseMoved(MouseEvent e) {
		//여기는 놓친 다음에 아예 못들었다...소스 보고 따라하기
		x=e.getX();
		y=e.getY();
		System.out.println("mouse drag : x:" + x +", y:" +y);
		repaint();
	}
	
	@Override
	//키가 눌려져 있을 때 호출
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode());//키코드값 호출 어떤 키가 눌렸는지
		System.out.println(e.getKeyChar());//키 문자값
		
		switch (e.getKeyCode()) {
		//아직 손에 안 익은 문법이 switch case다... 연습해야지...
		//키 코드값에 따라서 분기
		
		//이미지가 프레임 밖으로 빠져나가지 않게 처리함.
		case KeyEvent.VK_UP://키보드 방향키 up 눌렀을 때
			y=Math.max(0, y-5);//max()는 두 값 중 최대값 구하는 메서드 //화면 밖으로 못 나가게끔 max() 활용
			break;
		case KeyEvent.VK_DOWN://키보드 down키 눌렀을 때
			y=Math.min(300-height, y+5);//화면 크기인 300 이상 올라가지 못하게 min()활용
			break;
		case KeyEvent.VK_LEFT:
			x=Math.max(0, x-5);
			break;
		case KeyEvent.VK_RIGHT:
			x=Math.min(300-width, x+5);
			break;
		}
		repaint();
	}
	
	@Override
	//컴퍼넌트 상에서 마우스 버튼을 누르는 시점에 호출
	public void mousePressed(MouseEvent e) {
		
	}
	
	@Override
	//마우스를 클릭했다가 땔 때 호출됨. //굉장히 섬세하게 나눠져 있다.
	public void mouseReleased(MouseEvent e) {
		
	}
	
	@Override
	//마우스가 해당 컴퍼넌트에 진입할 때 호출
	//마우스가 컴퍼넌트 위에 올라갈 때??
	public void mouseEntered(MouseEvent e) {
	
	}
	@Override
	//키 입력하면 호출
	public void keyTyped(KeyEvent e) {
		
	}
	@Override
	//키보드에서 손가락 땔 때
	public void keyReleased(KeyEvent e) {
		
	}
	@Override
	//해당 컴퍼넌트가 종료하면 호출
	public void mouseExited(MouseEvent e) {

	}
}
