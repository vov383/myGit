package ch05;

import java.util.Scanner;

public class InputSum {

	public static void main(String[] args) {
		
		int num[] = new int[5]; //배열참조변수 []의 위치는 자료형 뒤에 와도 되고 변수명 뒤에 와도 되고
		int sum=0;
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<num.length; i++) {
			System.out.print((i+1)+"번째 숫자를 입력하세요 : ");
			num[i]=scanner.nextInt();
			sum += num[i];
		}
		System.out.println("합계 : " +sum);
		scanner.close();
	}
	
}
