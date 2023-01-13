package ch19;

import java.net.ServerSocket;

//소켓 두 가지
//서버 소켓 : 서버에서 서비스를 하기 위한 목적으로 만드는 소켓
//일반 소켓 : 일반 클라이언트에서 사용되는 소켓

//포트번호 : 0~65535 내에서 배정가능. 중복 불가. 충돌 일어나기 때문
//웹프로그램에서 특정 프로그램과 포트충돌 일어날 수 있음. 그때마다 조정해줘야

//1 port 1 service

//well known port number(자주 사용되어지는 포트 번호)
// 80:웹서비스, 21:FTP서비스, 445:파일공유, 3389:원격접속 ......
//최소한 이런 포트들을 피해서 써야한다

public class SocketExam {

	public static void main(String[] args) {
		ServerSocket socket = null;
		for (int i = 0; i < 65535; i++) {
			try {
				socket = new ServerSocket(i);//서버소켓 생성
				socket.close();//소켓 서비스 종료
				
			} catch (Exception e) {
				//사용중인 포트가 있다면 exception에서 출력해보자
				System.out.println(i+"번 포트가 사용중입니다.");
				//사용중인 포트번호가 출력된다
				//이런 번호는 포트 실습할 때 피해야 한다.
			}
		}
		System.out.println("포트 검사를 마쳤습니다");
		
	}
}
