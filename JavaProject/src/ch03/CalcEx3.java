package ch03;

import java.util.Scanner;

public class CalcEx3 {
	// printf() 형식지정자. //나눗셈 연산자 사용할 때 형변환이 필요한 경우
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("정수a를 입력하세요 : ");
		int a = in.nextInt();
		System.out.println("정수b를 입력하세요 : ");
		int b = in.nextInt();
		in.close();
		
		
		System.out.printf("a+b=%d\n", a+b);
		System.out.printf("a-b=%d\n", a-b);
		System.out.printf("a*b=%d\n", a*b);
		
		/*
		System.out.printf("a/b=%.2f\n", a/b);	//java.util.IllegalFormatConversionException: f != java.lang.Integer
												//fomat을 int값이 들어왔는데 연산상 실수값이 나오는 경우 에러. 형변환(double)을 써야함.
		*/		
		System.out.printf("a/b=%.2f\n", (double)a/b);
		
		System.out.printf("a%%b=%d\n", a%b);
	}
}
