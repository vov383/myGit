package ch04;

import java.util.Scanner;

public class while_Point2 {

	public static void main(String[] args) {
		
		int count=0;
		int sum=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어 영어 수학 점수를 각각 입려갛고 마지막에 -1을 입력하세요.");
		int n = scanner.nextInt();
		while(n != -1) { // -1 입력되면 while문 빠져나가겠다
			sum += n;
			count++;
			n = scanner.nextInt(); //(-1 입력용)
		}
		
		if(count == 0)	// 구현부가 한줄이면 { }중괄호 생략 가능. 그래도 쓰는 편이 가시성이 좋은듯?? 
			System.out.println("입력된 수가 없습니다.");
		 else {
			System.out.printf("총점은 %d 이고 평균은 %.1f 입니다", sum, (double)sum/count); 
			//포맷 형식이 실수로 자리잡음. 타입 맞춰서 형변환 필요.
		}
		scanner.close();
	}
}
