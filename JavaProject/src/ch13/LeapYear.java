package ch13;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("연도를 입력하세요 : ");
		int year = scan.nextInt();
		
		GregorianCalendar cal = new GregorianCalendar();//우리가 쓰는 그레고리력 처리해주는 객체
		if(cal.isLeapYear(year)) {//isLeapYear() 윤년 계산 메서드
			System.out.println("윤년입니다.");
		}else {
			System.out.println("평년입니다.");
		}
	}
}
