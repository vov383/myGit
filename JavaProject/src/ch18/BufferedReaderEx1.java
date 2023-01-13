package ch18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReaderEx1 {
	
	public static void main(String[] args) {
		
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		//Buffered계열(Reader계열(Stream))) 형태로 구성됨;
		
		System.out.println("문자열을 입력하세요 : ");
		String line;

		try {
			line = br.readLine();
			System.out.println("입력한 문자열 : "+ line);
		} catch (IOException e) {
			// TODO Auto-generated catch block
		}
		System.out.println("프로그램 종료");
	}
}
