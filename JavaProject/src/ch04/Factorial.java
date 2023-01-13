package ch04;
// factorial 연산 해보기
// 큰 숫자 자료형은 long 
//곱셈을 많이하면 int로는 무조건 부족하다
//

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		long fact = 1; //값이 클 거 같으니까 미리 데이터 타입을 long으로 선언
		int n;
		System.out.print("정수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=n; i++) {
			fact*=i;
		}
		System.out.printf("%d!은 %d입니다", n, fact);
	}
}
