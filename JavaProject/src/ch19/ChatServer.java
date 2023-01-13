package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {

	public static void main(String[] args) throws Exception{
		
		ServerSocket serverSocket = null;
		try {
			//서비스를 위한 포트 개방
			serverSocket = new ServerSocket(5554);
			System.out.println("서비스가 시작되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
			//네트워크 불안정하면 익셉션 잘 나
			System.out.println("서비스를 시작할 수 없습니다.");
			System.exit(1);//비정상 종료. 1은 정상종료랑 구분하려고 넣은 값
		}
		Socket clientSocket = null;
		try {
			//클라이언트의 접속을 기다리다가 접속하면 소켓연결
			clientSocket = serverSocket.accept();
			System.out.println("클라이언트의 ip : "
			+clientSocket.getInetAddress().getHostAddress());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		//발신용 스트림
		PrintWriter writer = new PrintWriter(
				clientSocket.getOutputStream(), true);
		//수신용 스트림
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				clientSocket.getInputStream()));
		
		//코드들이 정형화 되어 있다... 익숙해지기만 하면 돼
	
		String receive="";
		String send="welcom!!!";
		
		writer.println(send);//메세지 보내기 server 가 client한테
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			receive = reader.readLine();//한 라인 읽기. BufferedReader
			if(receive == null || receive.equals("quit")) {//종료조건
				break;
			}
			System.out.println("[client]"+ receive);
			System.out.println("서버님 입력하세요(종료:quit):");
			send = sc.nextLine();
			writer.print(send);//메세지 보내기
			if(send.equals("quit")) break;
			
		}
		//리소스 정리
		sc.close();//정석은 아닌데 간단한 프로그램이니까 이렇게 해도 큰 문제 없음
		writer.close();
		reader.close();
		clientSocket.close();
		serverSocket.close();
		
	}
	
}
