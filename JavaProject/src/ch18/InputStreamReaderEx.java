package ch18;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//InputStream : 1byte단위로 읽음
//inputStreamReader : 2byte단위로 읽음. 한글 /can/
public class InputStreamReaderEx {

	
	public static void main(String[] args) {
		InputStream is = System.in;//1byte 처리 Stream
		//new InputStreamReader(InputStream) 처리	
		InputStreamReader isr = new InputStreamReader(is);//inputStream을 생성자 안에 넣어서 2byte 처리
		
		System.out.print("한글자를 입력하세요 : ");
		
		try {
			int code = isr.read();
			System.out.println("code : "+code);
			char ch = (char)code;//문자
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
