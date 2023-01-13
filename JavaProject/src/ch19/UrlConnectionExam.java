package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

//IO 정리
//프로그램	 <======= 원격컴퓨터의 리소스 가져올 때는 InputStream
//프로그램	 =======> 원격컴퓨터의 리소스 보낼 때는 OutputStream
//순서가 있어
//1. 원격 컴퓨터에 접속
//2. 스트림 생성. 
//3. 입출력 처리

public class UrlConnectionExam {

	public static void main(String[] args) {
		
		URL url = null;//객체 초기화
		try {
			url = new URL("http://google.com");
			//원격 컴퓨터에 접속하는 객체
			//url 접속 시도 --> 성공하면 접속정보를 conn 참조변수에 저장
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();//형변환
			//만약 접속 시도 실패하면? conn 변수값 null;
			if(conn != null) {//접속 성공하면
				//서버에서 일정 시간동안 응답이 없으면 연결을 종료시킴
				conn.setConnectTimeout(3000);//3000ms == 3sec 타임아웃 시간 설정
				StringBuilder sb = new StringBuilder();
				//StringBuilder는 String에 비해 mutable
				//정상적으로 처리된 경우
				//http status code(상태코드)
				if(conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
					
					//스트림을 사용해서 html 소스코드 읽어옴
					//버퍼 활용
					BufferedReader br = new BufferedReader(
							new InputStreamReader(conn.getInputStream(), "utf-8"));
			
					while(true) {
						String line = br.readLine();//한 라인을 읽음
						if(line == null) break;//더이상 내용이 없으면 종료
						sb.append(line+"\r\n");//줄바꿈 문자, 캐리지 리턴
						
					}
					br.close();//버퍼 닫아
				}
				conn.disconnect();//현재 연결되어 있는 http의 연결 종료시켜
				System.out.println(sb);//얘를 빼먹어서 아무것도 출력이 안됐구나
				//sb에 라인마다 추가해놓고 읽지를 않으니 아무것도 안나오지
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
//실행했더니 에러
//구글닷컴의 리소스 가져와야하는데 
//java.net.MalformedURLException: no protocol: google.com ==> url에 http:// 붙이면 해결

//요건 왜 해결이 안됐나
//.UrlConnectionExam.main(UrlConnectionExam.java:22) 요런 에러가 났네 
//리소스 값은 크롬 검사창으로 볼 수 있음
//이걸 볼 수 있는 기법이 중요
