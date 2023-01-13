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
//MouseListener : 마우스이벤트 처리를 위한 인터페이스
//MouseMotionListener : 마우스 이동 이벤트 처리를 위한 인터페이스
//KeyListener : 키보드이벤트 처리를 위한 인터페이스
public class KeyMouseExamm extends JApplet 
implements MouseListener, MouseMotionListener, KeyListener {
	private int x,y;//이미지를 출력할 x,y좌표값
	private int width, height;//이미지 가로,세로 사이즈
	private Image img;//이미지를 다룰 객체
	private boolean flag=false;//이미지가 처음실행할땐 안보이게 false로씀
	
	@Override
	public void init() {
		setSize(300, 300);//화면 사이즈
		img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("car.gif"));
		this.addMouseListener(this);//현재 클래스에 마우스 이벤트 기능을 추가(중요코드)
		this.addMouseMotionListener(this);
		this.addKeyListener(this);//현재 클래스에 키이벤트 기능 추가
		setFocusable(true);//키입력을 받을 수 있도록 설정
		requestFocus();
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		//이미지의 가로,세로 길이 계산
		width = img.getWidth(null);
		height = img.getHeight(null);
		System.out.println(width+","+height);
		if(flag) {
			g.drawImage(img, x, y, this);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// 키를 입력하면 호출
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// 키가 눌려져 있을때 호출
		System.out.println(e.getKeyCode());//키 코드값
		System.out.println(e.getKeyChar());//키 문자값
		switch (e.getKeyCode()) { //키코드값에 따라 분기
		//max(값,값) 앞의 값과 뒤의값 중 최대값 구함. min(값,값) 최소값들을 리턴받아
		//이미지가 프레임 바깥으로 빠져나가지 않게 처리함.
		case KeyEvent.VK_UP://위쪽 키를 눌렀을 때
			y=Math.max(0, y-5); break;
		case KeyEvent.VK_DOWN://아래쪽 키를 눌렀을 때
			y=Math.min(300-height, y+5); break;
		case KeyEvent.VK_LEFT://왼쪽 키를 눌렀을 때
			x=Math.max(0, x-5); break;
		case KeyEvent.VK_RIGHT://오른쪽 키를 눌렀을 때
			x=Math.min(300-width, x+5); break;
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// 키보드를 땔때에 호출
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// 마우스를 드래그할때 호출
		System.out.println("mouse drag: x:"+x+", y:"+y);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// 마우스가 이동했지만 버튼이 작동않은 경우에 호출.
		x = e.getX();
		y = e.getY();
		System.out.println("mouse move: x:"+x+", y:"+y);
		repaint();
	}

	//컴퍼넌트상에서 마우스 버튼을 클릭(눌렀다 놓을때)했을 때 호출
	@Override
	public void mouseClicked(MouseEvent e) {
		flag=true;//클릭할때 그림 true로 설정해서 보여지게함.
		//마우스 클릭한 좌표값 저장
		x = e.getX();
		y = e.getY();
		repaint();//그래픽 갱신 요청 => paint()가 호출됨
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// 컴퍼넌트상에서 마우스 버튼을 누르는 시점 때에 호출
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// 마우스를 떼어 놓아질때 호출
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// 마우스가 해당 컴퍼넌트에 진입할때 호출
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// 마우스가 컴퍼넌트를 종료하면 호출
	}

}
