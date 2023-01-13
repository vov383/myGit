package ch17;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuEx extends JFrame{

	private JMenuItem mie = new JMenuItem();
	
	public MenuEx() {
		super("Menu 예제");
		createMenu();
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	private void createMenu() {
		JMenuBar mb = new JMenuBar();//메뉴바 생성 //상단에 toolBar처럼
		JMenu jm = new JMenu("File");//메뉴생성
		jm.add(new JMenuItem("Open"));//메뉴에 메뉴 아이템 추가
		jm.add(new JMenuItem("Save"));
		jm.add(new JMenuItem("Delete"));
		jm.add(new JMenuItem("Print"));
		jm.addSeparator();//구분선 추가. 메뉴창에서
		jm.add(mie);
		mb.add(jm);//메뉴바에 메뉴 추가
		mb.add(new JMenu("Edit"));
		mb.add(new JMenu("Project"));
		mb.add(new JMenu("Run"));
		
		//프레임에 메뉴바 추가(메뉴바 붙이기 프레임만 /can/)
		setJMenuBar(mb);
		
		mie.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new MenuEx();
		//이클립스도 GUI 프로그램
	}
}
