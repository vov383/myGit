package ch06;
//메서드로 구구단 만들기
//메서드이름() 미리 메서드를 호출하고 이클립스로 만들기.
import java.util.Scanner;

public class Method_Gugu {

	public static void main(String[] args) {
		int dan;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력하세요 : ");
		dan = sc.nextInt();
		gugu(dan); //메서드 호출. 매개변수 숫자 맞추고 자료형 맞추고. 
		sc.close();
	} //end main() 프로그램 종료.

	public static void gugu(int dan) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan+" X "+i+"="+dan*i);
		}
	}
}
