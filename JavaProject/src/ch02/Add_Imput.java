package ch02;

import java.util.Scanner;

public class Add_Imput {

	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);//스캐너 생성 시 참조변수는 아무거나 써o
		int x;//지역변수
		int y;
		int sum;
		
		System.out.print("첫 번째 숫자를 입력하세요 : ");
		x = input.nextInt();// 정수로 선언했는데 실수 넣으면 InputMismatchException 
		System.out.print("두 번째 숫자를 입력하세요 : ");
		y = input.nextInt();
		
		sum = x + y;//산술연산자. 
		System.out.println(sum);
		
		input.close();//스캐너 객체 닫기.
	}

}
