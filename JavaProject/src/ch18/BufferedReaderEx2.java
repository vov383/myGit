package ch18;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderEx2 {
	
	public static void main(String[] args) {
		//한줄로 BufferedReader 생성. 참조변수가 필요없을 때. 바로 객체로 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문자열 한줄을 입력하세요 : ");
		
		try {
			String str = br.readLine();//여기 듣다가 놓쳤네...
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}
}
