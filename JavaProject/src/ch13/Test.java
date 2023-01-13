package ch13;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		
		System.out.println(Math.ceil(10.1));
		System.out.println(Math.round(10.5)); //int 반환하네
		System.out.println(Math.floor(10.9));
		System.out.println(Math.pow(10, 3));
		
		Random rand = new Random();
		System.out.println("정수값 : "+ rand.nextInt(100)); //100이하 랜덤 정수 생성.
		System.out.println("실수값 : "+ rand.nextDouble()); //1이하 랜덤 실수 생성.
		
		
		//WrapperClass
		int a = 10;
		Integer b = 20; //1.5이하 버전은 에러. 지금은 내부적으로 intValue()가 작동.
		Integer c = new Integer(30); //이게 정석.
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(c.intValue()); //이게 정식 문법. 생략해도 내부적으로 작동.
		
	}
}
