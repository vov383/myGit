package ch04;
/*
while문은 무한루프를 발생시킬 때 많이 쓴다.
게임 같이

 */
import java.util.Scanner;

public class While_Point {

	public static void main(String[] args) {
		
		int total = 0;
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		while(num !=0) { //무한루프. 0이 들어오지 않으면 무한반복
			total += num; // total = total + num;
			System.out.println("현재 누적된 값 : " + total);
			System.out.println("계속 입력하세요.(종료를 원하면 0을 입력)");
			num = input.nextInt(); //조건식의 무한루프를 빠져나갈 용도
		} 
		
		System.out.println("총 누적 합 :" + total);
		System.out.println("프로그램을 종료합니다");
		input.close();
	}
}
