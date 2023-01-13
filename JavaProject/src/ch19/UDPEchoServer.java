package ch19;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPEchoServer {

	public UDPEchoServer(int port) {//기본생성자
		try {//네트워크 프로그램은 항상 트라이캐치
			DatagramSocket ds = new DatagramSocket(port);
			while(true) {
				//udp 방식은 데이터를 바이트 배열로 전송함, String을 바로 보낼 순 없음. 패킷단위로 조각내서 보내야
				//(참고 : 바이트배열의 최대크기는 65508바이트)
				byte buffer[] = new byte[512];
				//udp방식 프로토콜의 통신은 데이터를 패킷(데이터 조각)으로 만들어서 전송
				DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
				System.out.println("ready");
				//client가 보낸 메시지 수신하려고 대기하는 코드
				//소켓을 통해 수신된 클라이언트의 메시지를 DatagramPacket에 저장
				ds.receive(dp);
				
				//패킷으로 들어온 클라이언트의 byte[] 메시지를 String으로 변환
				String str = new String(dp.getData());
				System.out.println("클라이언트에서 보낸 메시지 : "+ str);
				
				InetAddress ia = dp.getAddress();//client측 ip주소를 get해서 ia에 담아. InetAddress type으로
				port = dp.getPort();//client측 port번호 get
				System.out.println("client ip : "+ ia + " , client port : "+ port);
				//여기까지 수신
				
				//여기부터 클라이언트에게 전송할 패킷객체 생성
				//생성자 매개변수 4개짜리(바이트배열, 바이트배열 크기, ip주소, port번호)
				dp = new DatagramPacket(dp.getData(), dp.getData().length, ia, port);
				ds.send(dp);//클라이언트에게 자료 전송
				ds.close();//소켓 닫기
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
	
		new UDPEchoServer(3000);//서버측 포트번호 생성
	
	}
}
