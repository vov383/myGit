package ch18;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderEx2 {

	public static void main(String[] args) {
		
		int var = 0;
		Reader input = new InputStreamReader(System.in);//다형성 기법
		//System.in 은 대표적인 InputStream
		//InputStream 형식 => InputStreamReader(InputStream)
		//생성자 안에 매개변수로 InputStream이 들어가야
		
		System.out.print("입력하세요 : ");
		while(true) {
			try {
				var = input.read();//1문자를 읽어들임 //Scanner 역할
				if(var == 13) {//13은 엔터키
					break;
				}
				System.out.println(var + "==>" +(char)var);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	}
}
