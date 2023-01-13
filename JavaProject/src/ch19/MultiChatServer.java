package ch19;

import java.awt.BorderLayout;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


class ServerScreen extends JFrame{
	JTextArea ta;
	JTextField tf;

	public ServerScreen() {
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("채팅방 서버!");
		
		JLabel label = new JLabel("This is a server");
		add(label, BorderLayout.NORTH);
		setVisible(true);
	}
}//메세지 수신 관련 클래스


public class MultiChatServer {//한 파일에 public class는 하나

	HashMap userMap;
	
	public MultiChatServer() {//생성자
		userMap = new HashMap<>();
		Collections.synchronizedMap(userMap);
	}
	
	public static void main(String[] args) {//main()은 public class 안에 하나만
		
		new ServerScreen();
		new MultiChatServer().serviceStart();//서비스 개시. 퀵픽스로 메서드 생성
	}

	public void serviceStart() {
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(7777);
			System.out.println("서버가 시작되었습니다.");
			while(true) {
				socket = serverSocket.accept();//접속대기상태
				System.out.println("["
				+socket.getInetAddress()+"]"+"에서 접속하셨습니다.");
				
				//클라이언트 별로 메세지 수신을 하기 위해서는 스레드가 필요함
				//만약 10명이 접속하면? 10개의 스레드 생성(스레드 많이 쓰면 속도 느려져)
				ServerReceiver receiveThread = new ServerReceiver(socket);
				receiveThread.start();
				System.out.println("현재 실행중인 스레드 네임 : "
				+ receiveThread.getName());
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}//serviceStart() 
	
	//현재 접속중인 모든 클라이언트들에게 메세지를 전송
	void sendToAll(String msg) {
		//메세지를 받아서 일관 전송(HanshMap에서 key값의 집합을 리턴받음
		Iterator it = userMap.keySet().iterator();
		while(it.hasNext()) {
			try {
				//메시지 전송을 위한 출력 스트림
				DataOutputStream out = (DataOutputStream)userMap.get(it.next());
				out.writeUTF(msg);//메세지 전송
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}//sendToAll()
	
	class ServerReceiver extends Thread {//내부클래스
		Socket socket;
		DataInputStream in;
		DataOutputStream out;
		
		public ServerReceiver(Socket socket) {
			this.socket = socket;
			try {
				//데이터 통신을 위한 입출력 스트림 생성
				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());
				
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("ServerReceiver 소켓 IO 에러");
			}
		}
		@Override
		public void run() {
			String name = "";
			try {
				name = in.readUTF();
				sendToAll("#"+name+" 님이 들어오셨습니다.");
				userMap.put(name, out);//HashMap에서 사용자 추가
				System.out.println("현재 접속자 수는 "+ userMap.size()+" 입니다.");
				while(in != null) {
					//받은 메세지를 모든 사용자에게 보냄
					sendToAll(in.readUTF());
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			} finally {
				//대화방에서 나가는 사람의 정보 출력
				sendToAll(name + "님이 나가겼습니다.");
				userMap.remove(name);//HashMap에서 사용자 제거
				System.out.println("["+ socket.getInetAddress()+":"
				+socket.getPort()+"]에서 접속을 종료함");
				System.out.println("현재 접속자 수는 "+ userMap.size() + "입니다.");
				
			}
		}
		
	}
	
}