package ch04;
/*
 * 휴가일수 계산
 * 근속연수 1~3 => 3일, 4~9년 => 5일
 * 10년 이상 => 10일, 20년 이상 => 20일
 * 변수는 선언만 하고 Scanner로 입력 받음
 * if else if 문으로 휴가일수 계산
 */
import java.util.Scanner;

public class Holiday {
	public static void main(String[] args) {
		//변수선언
		int year;
		int days;
		//입력
		Scanner scan = new Scanner(System.in);
		System.out.print("근속연수를 입력하세요 : ");
		year = scan.nextInt();
		scan.close();
		
		//계산
		if (year <= 3) {
			days = 3;
		}else if(year <10) {
			days = 5;
		}else if (year<20 ) {
			days = 10;
		}else { //그외의 모든 경우
			days = 20;
		}
		//출력
		System.out.println("당신의 근속년수는" + year + "년 이고,");
		System.out.println("휴가 일수는" +days+ "일 입니다.");
	}
}
