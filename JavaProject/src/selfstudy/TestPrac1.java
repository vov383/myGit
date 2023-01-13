package selfstudy;

import java.util.Scanner;

public class TestPrac1 {

	public static void main(String[] args) {
		
		String str;
		Scanner scanner = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : > ");
		str = scanner.next();
		
		while(true) {
			if(str.equals("exit")) { //문자열 비교는 == 로 못해. equals() 메서드 활용할 것.
				System.out.println("프로그램을 종료합니다.");
				scanner.close();
				break;
				
			} else {
			System.out.println(str.length()+"글자입니다.");
			System.out.print("문자열을 입력하세요 : > ");
			str = scanner.next();
			}
		}
	}
}
