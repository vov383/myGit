package ch06;

import java.util.Scanner;

public class HolidayEx {

	static int y; //static 변수(전역변수, 멤버변수). 클래스 바로 밑에 선언.
	
	static void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("근속연수를 입력하세요 : ");
		y = scan.nextInt(); //입력받는 기능을 메서드 안에 넣었다.
		scan.close();
	}
	
	static int holiday(int year) {
		int day = 0; //지역변수. 메서드 안에서 선언한 변수. 해당 메서드 안에서만 쓸 수 있다.
		if(year <= 5) { //근속연수 5년 이하
			day= 10; //10일 휴가
		}else if(year <=10) {
			day = 15;
		}else {
			day = 20;
		}
		return day; //휴가일수를 반환.
	}
	public static void main(String[] args) {
		input();
		System.out.println("휴가 일수 : " + holiday(y)); 
	}
}
