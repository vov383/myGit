package ch18;

import java.io.IOException;

public class InputStreamEx2 {

	public static void main(String[] args) {

		try {
			int var = 0;
			System.out.print("내용을 입력하세요 : ");
			var = System.in.read();
			
			while(var !=13) {//엔터키(13)를 입력할 때까지 반복
				System.out.println(var+"==>"+(char)var);
				var = System.in.read();
				
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
