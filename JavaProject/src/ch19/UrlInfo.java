package ch19;

import java.net.URL;
//네트워크 관련 객체들은 다 .net 에 들어있다.
public class UrlInfo {
	//깃에 올려서 확인해볼 주석
	public static void main(String[] args) {
		
		try {
			//new URL("url주소") url문자열을 URL 클래스 형식으로 변환시켜
			URL url = new URL("https://blog.naver.com/badabooks/221081373786");
			//정보값 출력해보기
			System.out.println("프로토콜:"+url.getProtocol());
			System.out.println("포트번호:"+url.getPort());
			System.out.println("호스트:"+url.getHost());
			System.out.println("파일:"+url.getFile());
			System.out.println("기타:"
			+url.toExternalForm());//다른 정보도 한꺼번에 가져오기 가능
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
/*
[console]
프로토콜:https
포트번호:-1
호스트:blog.naver.com
파일:/badabooks/221081373786
기타:https://blog.naver.com/badabooks/221081373786
*/