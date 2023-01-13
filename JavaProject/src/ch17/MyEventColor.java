package ch17;
//0106 과제1
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class EventAction implements ActionListener{
	private JFrame f;
	private Color c;
	private Container con;

	public EventAction(JFrame f, Color c) {
		this.f = f;
		con = f.getContentPane();//프레임 컨텐츠 영역으로 활용
		this.c = c;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		con.setBackground(c);//배경색상 변경
	}
}


public class MyEventColor extends JFrame{

	private JButton button1, button2, button3, button4, button5;
	private JPanel panel1, panel2, panel3, panel4, panel5;

	public MyEventColor() {
		
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		panel5 = new JPanel();
		
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.green);
		panel3.setBackground(Color.blue);
		panel4.setBackground(Color.yellow);
		
		
		button1 = new JButton("빨");
		button2 = new JButton("초");
		button3 = new JButton("파");
		button4 = new JButton("노");
		
		panel1.add(button1);
		panel2.add(button2);
		panel3.add(button3);
		panel4.add(button4);
		
		setSize(450, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		//버튼 추가
		add(panel1, "North");
		add(panel2, "East");
		add(panel3, "South");
		add(panel4, "West");
		
		//핸들러
		button1.addActionListener(new EventAction(this, Color.red));
		button2.addActionListener(new EventAction(this, Color.green));
		button3.addActionListener(new EventAction(this, Color.blue));
		button4.addActionListener(new EventAction(this, Color.yellow));
			
		
	}

	public static void main(String[] args) {
		new MyEventColor();
	}
}
