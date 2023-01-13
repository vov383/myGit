package ch18;

import java.io.InputStream;


/*
~stream 객체들은 1byte 단위로 스트림 처리. 영문, 대소문자, 숫자, 특수문자만 처리 /can/ (한글 처리 불가)
InputStream, OutputStream
 */
public class InputStreamEx1 {

	
	public static void main(String[] args) {
		InputStream is = System.in;//대표적인 System.in은 InputStream이다.
		System.out.print("문자를 입력하세요 : ");
		
		try {//입출력, 네트워크, DB 는 필수적 예외처리 /have to/
			int code = is.read();//키보드로부터 1byte를 읽음, 따라서 한글(2byte) 처리 안됨
			// => 한글처리하려면 InputStreamReader 사용
			System.out.println(code);
			char ch = (char)code;//타입 좌변에 맞춰 //모든 문자에는 고유한 숫자코드가 있다.
			// => 형변환으로 int형 code를 char형 문자값으로 /can/
			System.out.println("char : "+ch);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
