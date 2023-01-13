package ch13;

import java.util.Random;

public class Rand {
	public static void main(String[] args) {
		
		Random r = new Random();
		System.out.println(r.nextDouble());//실수형으로 랜덤값
		System.out.println(r.nextInt(100));//정수형으로 0~99까지. ()에 안적으면 임의의 정수값.
		System.out.println(r.nextInt(101)+100);//정수형 100~200까지
		System.out.println(Math.random());//0.0~1.0미만의 실수값
		
		int num = (int)(Math.random()*100);//0부터 99까지 정수화
		System.out.println(num);
		
		//배열의 index 값에 난수 사용
		String[] prize = {"1등", "2등", "3등", "다음 기회에"};
		System.out.println(prize[r.nextInt(4)]);//0~3 난수 발생
	}
}
