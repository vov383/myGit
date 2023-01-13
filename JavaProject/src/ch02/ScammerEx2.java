package ch02;

import java.util.Scanner;

public class ScammerEx2 {
	//Scanner(System.in) 입력값 type 	string, short, int, long, float, double
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("이름을 입력하세요 : ");
		String name = scan.next();//문자열 입력.		

		System.out.println("나이를 입력하세요 : ");
		short age = scan.nextShort();//정수 입력.		
		System.out.println("현재 가진 현금을 입력하세요 : ");
		int money = scan.nextInt();//정수 입력.		
		System.out.println("집에서 직장까지의 거리를 입력하세요 : ");
		long distance = scan.nextLong();//정수 입력.
		System.out.println("신장(키)를 입력하세요 : ");
		float height = scan.nextFloat();//실수 입력. // 정수로 넣었어도 실수로 출력됨.
		System.out.println("몸무게를 입력하세요 : ");
		double weight = scan.nextDouble();//실수값 입력. double은 8byte 정수로 넣었어도 실수로 출력됨.
		
		System.out.println("==============");
		System.out.println("당신의 이름은 " + name+ " 입니다.");
		System.out.println("당신의 나이는 " + age+" 입니다.");
		System.out.println("당신의 현재 cash 는 " + money+" 입니다.");
		System.out.println("당신의 출근 거리는 " + distance+"m 입니다.");
		System.out.println("당신의 키는 " + height+" 입니다.");
		System.out.println("당신의 몸무게는 " + weight+" 입니다.");
		System.out.println("==============");
		
		scan.close();//스캔 객체를 종료(메모리 상에서).
		
	}
}
