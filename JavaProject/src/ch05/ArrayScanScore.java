package ch05;

import java.util.Scanner;

/*
12-20 과제
성적 입력 받아 합계와 평균 구하기.
학생 수 입력 받아
성적 입력 받아
입력 받은 걸로 총점, 평균 계산
 */
public class ArrayScanScore {

	public static void main(String[] args) {
		int student = 0; 
		int sum=0;
		int point[]; //배열 초기화부터

		Scanner scan = new Scanner(System.in);

		System.out.print("성적처리할 학생수를 입력하세요 : ");
		student = scan.nextInt(); //학생 수 입력 받아서
		for (int i = 0; i < student; i++) { //학생 수만큼 점수 입력 반복해
			System.out.print("성적을 입력하세요 : ");
			point = new int[student]; //배열 크기 지정하고
			point[i] = scan.nextInt(); //배열 값 입력

			sum += point[i]; //점수 누적시키기

		} //end for()
		scan.close();
		System.out.println("총점은 "+sum+"점 입니다.");
		System.out.println("평균은 "+(double)sum/student+"점 입니다.");
	}
}
