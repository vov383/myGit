package ch04;
/*
 * 휴가일수 계산
 * 근속연수 1~3 => 3일, 4~9년 => 5일
 * 10년 이상 => 10일, 20년 이상 => 20일
 * 변수는 선언만 하고 Scanner로 입력 받음
 * if else if 문으로 휴가일수 계산
 */
import java.util.Scanner;

public class Holiday2 {
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
		if(year>=20) {
			days = 20;
		}else if(year>=10){
			days = 10;
		}else if(year>=4) {
			days = 5;
		}else {
			days = 3;
		}
		//출력
		System.out.println("당신의 근속년수는\t" + year + "년 이고,");
		System.out.println("휴가 일수는\t" +days+ "일 입니다.");
	}
}
