package ch02;

import java.util.Scanner;
// Odd(홀수)Even(짝수)
public class OddEven {

	//삼항 연산자
	//(%2==0)을 활용해서 짝수와 홀수 찾기.
	public static void main(String[] args) {
		int num;
		Scanner in = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		num = in.nextInt();
		System.out.println(num % 2 == 0 ? "짝수" : "홀수");
		//a%b a를 b로 나눈 나머지값		//=하나 
		//삼항연산자 ==> 1항 ? 2항(true): 3항(false)
		in.close();
	
	}	

}
