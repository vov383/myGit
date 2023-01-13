package ch18;

import java.awt.Container;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SwingFileIO extends JFrame implements ActionListener{

	Container cp;
	JButton btnSave, btnLoad;
	JTextArea ta;
	
	public SwingFileIO() {
		super("파일 입출력");
		cp = this.getContentPane();
		this.setBounds(100, 100, 400, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setDesign();//별도의 메서드 만들어
		this.setVisible(true);
		
	}
	
	public void setDesign() {
		JPanel pTop = new JPanel();
		btnSave = new JButton("save file");
		btnLoad = new JButton("load file");
		pTop.add(btnSave);
		pTop.add(btnLoad);
		this.add("North", pTop);
		
		ta = new JTextArea();
		JScrollPane sp = new JScrollPane(ta);
		this.add("Center", sp);//이것도 오타때문에 에러...대소문자 구분 실수...
		
		btnSave.addActionListener(this);
		btnLoad.addActionListener(this);
		
	}

	//기능 정의
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if(ob == btnSave) {//파일저장 버튼 누르면 파일저장기능
			FileDialog fd = new FileDialog(this, "saving file", FileDialog.SAVE);//모달 창
			fd.setVisible(true);
			String filename = fd.getDirectory()+fd.getFile();
			if( fd.getFile() == null ) {
				return;
			}
			
			FileWriter fw = null;
			try {
				fw = new FileWriter(filename);
				fw.write(ta.getText());
				ta.setText("saved");
				fw.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}else if(ob == btnLoad) {//파일 부러오는 기능
			FileDialog dlg = new FileDialog(this, "open file", FileDialog.LOAD);
			dlg.setVisible(true);
			String filename = dlg.getDirectory()+dlg.getFile();
			if(dlg.getFile() == null)
				return;
			FileReader fr = null;
			try {
				fr = new FileReader(filename);
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
			BufferedReader br = null;
			br = new BufferedReader(fr);
			ta.setText("");//이전 글 모두 삭제
			while(true) {
				String line = "";
				
				try {
					line = br.readLine();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				if(line == null)
					break;
				ta.append(line+"\n");
			}
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		
	}

	public static void main(String[] args) {
		
		new SwingFileIO();//메인에 생성자 만들고 실행
	}
	
}
