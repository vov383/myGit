package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {

	public static void main(String[] args) throws Exception{//위임처리
		Socket socket = null;
		PrintWriter writer = null;
		BufferedReader reader = null;
		
		try {
			socket = new Socket("127.0.0.1", 5554);//127 ... 요게 내 로컬 ip
			writer = new PrintWriter(socket.getOutputStream(), true);
			reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		String receive = "";
		String send;
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			receive = reader.readLine();//메세지 읽음
			System.out.println("[Server] : "+receive);
			if(receive.equals("quit")) break;
			System.out.println("클라이언트님 입력하세요(종료:quit):");
			send=sc.nextLine();//키보드로 입력
			if(send.equals("quit")) {
				System.out.println("종료되었습니다.");
				break;
			}
			if(send != null) {
				writer.print(send);//메세지 보내기
			}
			
		}
		//리소스 정리
		sc.close();
		writer.close();
		reader.close();
		socket.close();
		
	}
}
//클라이언트에서 채팅 쳤는데 안보내지네... 머가 또 빠졌나.../??