package ch05;

import java.util.Scanner;

public class EqualsEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("문자열을 입력해주세요 : ");
			//String 은 char 를 배열화 해서 만든 객체. "Java" 라는 문자열은 내부적으로 [] = 'j' 'a' 'v' 'a'를 배열화해서 처리해준다.
			//그래서 길이값을 갖는다.
			String str = sc.nextLine(); //문자열을 라인 단위로 읽어준다.
			if(str.equals("exit")) { //문자형참조변수.equals("비고할문자")
				//참고 : 값을 비교할 때는 "==" 쓰고 문자열을 비교할 때 ".equals()" 쓴다.
				break;
			}else {
				System.out.println(str.length() + "글자 입니다."); //String 은 char 단문자를 배열처리한 자료형
					//length() : 문자열에 대한 글자 수 반환 메소드(배열의 길이값 리턴)
			}
		}
		sc.close();
		System.out.println("프로그램을 종료합니다.");
	}
}
