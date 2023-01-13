package ch19;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataServer {

	public static void main(String[] args) throws Exception{
		//try with문 연습해서 익숙해지자
		try(ServerSocket ss = new ServerSocket(8000)){
			System.out.println("서비스가 시작되었습니다");
			while(true) {
				//서버소켓은 일반소켓도 필요해
				//accept() : 클라이언트가 접속할 때까지 계속 대기상태
				//접속되면 소켓 연결(논리적 회선 연결함)
				Socket socket = ss.accept();
				PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
				SimpleDateFormat sdf 
				= new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
				//날짜포맷 yyyy:4자리 연도, MM월 ,dd날짜, HH 24시간제, hh 12시간제
				String str = sdf.format(new Date());
				out.println(str);//클라이언트에 데이터 전송
				socket.close();//소켓 종료	
			}
			
			
		}catch(Exception e) {
			
		}
		
		
	}
}
