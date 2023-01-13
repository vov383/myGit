package ch05;

import java.util.Scanner;

/*
 * 12-20 도전문제
 * 2차원 배열
 * 성적 입력, 스캐너 활용
 */
public class ArrayScore2d_Scan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int student = 0;
		int[][] point; //배열 선언

		System.out.print("학생 수를 입력하세요 : ");
		student = scan.nextInt(); //학생 수 입력 받아
		
		point = new int[student][3]; //배열 칸 정하고
		
		for (int i = 0; i < student; i++) { //학생 수만큼 반복해
			
			System.out.println("국, 영, 수 각 점수를 입력하세요.");
			for (int j = 0; j < point[i].length; j++) { // 과목수 3번만 반복하면 돼.
				System.out.print(i+1+"번 학생의 점수를 입력하세요 : ");
				point[i][j] = scan.nextInt(); //배열에 변수 입력으로 넣고
				
			} //inner for()
		} //outer for()	
		scan.close();
		
		//출력
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");
		for (int i = 0; i < point.length; i++) {
			int sum = 0;
			double avg = 0.0;
			System.out.printf("%d\t", i+1); //번호 출력
			for (int j = 0; j < point[i].length; j++) {
				sum += point[i][j]; //점수 누적시켜
				System.out.printf("%d\t", point[i][j]); 
			} //inner for()
			avg = sum/point.length; //평균 구하기
			
			char grade = ' ';
			if(avg > 90) { //등급 매기기
				grade = 'A';
			}else if (avg > 80) {
				grade = 'B';
			}else if (avg > 70) {
				grade = 'C';
			}else if (avg > 60) {
				grade = 'D';
			} else {
				grade = 'F';
			} //end if-else
			
			System.out.printf("%d\t%.1f\t%c%n", sum, avg, grade); //포맷 지정. 줄바꿈 넣기.
		} //end outer for()
		
	} //end main()

}
