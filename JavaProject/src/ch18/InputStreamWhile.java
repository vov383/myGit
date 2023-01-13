package ch18;
//0109 과제2
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamWhile {

	public static void main(String[] args) {
		int code = 0;
		System.out.print("내용을 입력하세요 : ");
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		try {
			code = isr.read();

			while(code !=13) {//엔터키(13)를 입력할 때까지 반복
				System.out.println(code+"==>"+(char)code);
				code = isr.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
