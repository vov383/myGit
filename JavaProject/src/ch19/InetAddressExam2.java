package ch19;

import java.net.InetAddress;

public class InetAddressExam2 {

	public static void main(String[] args) {
		try {
			InetAddress[] address = InetAddress.getAllByName("naver.com");
			//배열을 하니까 이클립스가 미리 알고 있음. 통계적으로 가장 많이 쓸 거같은 메서드를 추천해줌
			//getAllByName(url) ==> 여러개의 ip주소를 배열로 저장
			
			for(int i=0; i<address.length; i++) {
				System.out.println(address[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
/*
console
naver.com/223.130.200.107
naver.com/223.130.195.200
naver.com/223.130.195.95
naver.com/223.130.200.104

네이버가 돌리는 여러 address가 출력됨
이게 노출되면 보안 쪽으로는 좀 아쉬운 것
구글은 하나밖에 안나오더라 구글이 좀더 낫네
*/