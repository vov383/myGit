package ch19;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadImage {

	public static void main(String[] args) throws MalformedURLException {
		
		String website = "https://www.algumon.com/assets/img/profile_v2.png	";
		
		System.out.println("다운로드를 시작합니다.");
		URL url = new URL(website);//url 생성 //throws로 익셉션 던져

		//byte 배열
		byte[] buffer = new byte[2048];//버퍼용 바이트 배열 [2mb] 
		//너무 작아도 안되고 커도 안되고 적절하게 
		
		//파일로 저장 <=== 프로그램 <=== 서버의 이미지 파일
		//input 도 하고 output도 하고
		
		//try~with문 (java 1.7 부터 도입)
		//try(리소스 선언부) {  } catch(Exception e) {  }
		//finally가 없어도 리소스 선언부에 리소스 적으면 자동으로 종료시킴. ==> 손이 덜 가서 좋음
		//앞으로 많이 쓸 기법. Spring 에서
		//현업은 1.8 1.7도 쓰고 어떤 곳은 1.6 쓰기도 한다. 
		//자바 버전과 api의 호환성 때문인가봄
		
		try(InputStream in = url.openStream(); 
				OutputStream out = new FileOutputStream("c:\\test\\test.jpg")) {
			int length = 0;
			while ((length = in.read(buffer)) != -1 ) {//읽을 내용이 있다면 계속 true
				System.out.println(length+"바이트 읽음");
				//출력스트림.write(버퍼, 시작인덱스, 길이)
				out.write(buffer, 0, length);
			}
			System.out.println("다운 완료");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}