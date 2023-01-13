package ch19;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExam {

	public static void main(String[] args) {
		try {//네트워크도 트라이 캐치 필수
			InetAddress address = InetAddress.getByName("google.com");
			System.out.println(address);//호스트 이름과 ip주소
			System.out.println(address.getHostName());//개별적으로 호스트 이름 가져오기
			System.out.println(address.getHostAddress());//개별 ip주소값
			
			
		} catch (UnknownHostException e) {//알려지지않은 호스트에 대한 익셉션
			e.printStackTrace();
		}
		
		//실행결과
		/*
		 * google.com/142.250.206.238
google.com
142.250.206.238 
		 */
	}
}
