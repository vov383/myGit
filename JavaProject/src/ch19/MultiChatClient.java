package ch19;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MultiChatClient {
	
	static String nickName = null;//대화명
	static JTextArea ta;
	static JTextField tf;
	static DataOutputStream out;
	
	public static void main(String[] args) {
		nickName = JOptionPane.showInputDialog("대화명을 입력하세요.");//모달창
		new ClientScreen(nickName);
		Socket socket;
		
		try {
			String serverIp = "localhost";
			socket = new Socket(serverIp, 7777);//서버랑 port맞춰
			System.out.println("서버에 연결되었습니다.");
			Thread receiveThread = new ClientReceiver(socket);
			receiveThread.start();
			Thread sender = new ClientSender(socket, nickName);
			sender.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//메세지 전송용 스레드 클래스
	static class ClientSender extends Thread {
		Socket socket;
		String name;
		
		public ClientSender(Socket socket, String name) {
			this.socket = socket;//지역변수를 멤버변수로
			try {
				out = new DataOutputStream(socket.getOutputStream());
				this.name = name;
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {
			Scanner scanner = new Scanner(System.in);
			try {
				if(out != null) {
					out.writeUTF(name);//대화명 보내기
				}
				while (out != null) {
					out.writeUTF("["+ name +"]" + scanner.nextLine());
				} 
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//run()
		
	}//ClientSender{}
	
	//메세지 수신용 스레드 클래스
	static class ClientReceiver extends Thread{
		Socket socket;
		DataInputStream in;
		
		
		public ClientReceiver(Socket socket) {
			this.socket = socket;
			
			try {
				in = new DataInputStream(socket.getInputStream());
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}//생성자
		
		@Override
		public void run() {
			while(in != null) {
				try {
					String s = in.readUTF();
					System.out.println(s);
					ta.append(s + "\n");//출력하면서 줄바꿈
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	static class ClientScreen extends JFrame implements ActionListener {

		public ClientScreen(String nick) {
			setSize(300, 500);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setVisible(true);
			
			setTitle(nick+"의 채팅방 클라이언트");
			ta = new JTextArea(25, 40); //25행 40열 크기 에어리어 생성
			tf = new JTextField(25);
			tf.addActionListener(this);
			JPanel panel = new JPanel();
			
			//패널 레이아웃 변경
			panel.setLayout(new BorderLayout());
			
			//페널의 배치방향 설정
			panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
			JLabel label_name = new JLabel(nick + "님");
			panel.add(label_name, BorderLayout.WEST);
			panel.add(tf, BorderLayout.CENTER);
			
			//JTextArea 처리
			JScrollPane sp = new JScrollPane();
			panel.add(sp, BorderLayout.NORTH);
			sp.setViewportView(ta);
			add(panel, BorderLayout.SOUTH);
			
			
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == tf) {//텍스트필드에서 엔터키 입력
				
				try {
					out.writeUTF("["+ nickName + "]" + tf.getText());
					tf.setText("");
					
				} catch (Exception e2) {
					e2.printStackTrace();
					
				}
			}
		}
		
	}
	
}
