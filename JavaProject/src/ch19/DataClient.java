package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class DataClient {

	public static void main(String[] args) throws Exception{
		
		//new Socket("ip주소", 서버쪽에서 설정한 port번호)
		Socket s = new Socket("localhost", 8000); //Server 포트번호랑 맞춰줘야해
		BufferedReader input = new BufferedReader(
				new InputStreamReader(s.getInputStream()));
		//서버에서 보낸 메세지를 받음
		String res = input.readLine();
		System.out.println(res);
		s.close();//소켓 닫기
		System.exit(0);//0은 정상종료
		
		//아주 간단한 소켓 프로그래밍
		//먼저 서버쪽을 실행한 이후에 클라이언트를 실행하여야
	}
	
}
