package ch05;

import java.util.Scanner;

//사용자가 배열의 크기 지정하는 예제.
//Scanner 활용.
//avg를 구하기 위해 /scores.length 활용.

public class ArrayTest4 {

	public static void main(String[] args) {
		int total = 0;
		int size;
		Scanner scan = new Scanner(System.in);
		System.out.println("배열의 크기를 입력하세요 : ");
		size = scan.nextInt();
		int[] scores = new int[size]; //변수로 배열의 크기를 지정
		for(int i=0; i<scores.length; i++) {
			System.out.println("성적을 입력하세요 :" );
			scores[i] = scan.nextInt();
		}
		for(int i=0; i<scores.length; i++) {
			total += scores[i]; //
		}
		System.out.println("평균 성적은 " + total/scores.length + "점 입니다."); 
		//자료형이 double에서 int에 담기면서 값이 소실됐다고 봐도 되나??
		scan.close();
	}
	
}
