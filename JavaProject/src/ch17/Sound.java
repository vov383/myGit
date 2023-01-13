package ch17;

import java.applet.AudioClip;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;

//소리 관련해서
public class Sound extends JApplet implements ActionListener{

	private AudioClip audio;//사운드 처리해주는 객체
	private JButton play, stop, loop;
	
	
	@Override
	public void init() {
		setLayout(new FlowLayout());
		audio = getAudioClip(getClass().getResource("dingdong.wav"));
		//리소스 이름은 입력하다가 철자 많이 틀림. 리소스명은 복사하는것이 더 안전하다
		
		//버튼추가
		play = new JButton("PLAY");
		stop = new JButton("STOP");
		loop = new JButton("LOOP");
		
		add(play); add(stop); add(loop);
		
		//버튼에 이벤트 추가
		play.addActionListener(this);
		stop.addActionListener(this);
		loop.addActionListener(this);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();//다운캐스팅으로 타입 맞추고
		System.out.println(e.getSource());
		if(btn == play) {
			audio.play();//Audio 객체에서 지원하는 play()
		}else if(btn == stop) {
			audio.stop();
		}else if (btn == loop) {
			audio.loop();
		}
	}
/*
gui 는 우리는 웹에서는 잘 안쓰니까
그렇게 중요하진 않다
......

 */
}
