package ch05;
//12-20 도전과제 복습.
import java.util.Scanner;

public class ArrayScore2d_ScanRe {

	public static void main(String[] args) {
		int student=0;
		int score[][];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수를 입력하세요 : ");
		student = sc.nextInt();
		
		score = new int[student][3];
		for (int i = 0; i < score.length; i++) {
			System.out.print(i+1+"번 학생의 국 영 수 점수를 각각 입력하세요 : ");
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = sc.nextInt();
			}
			
		}
		sc.close();
		
		//출력
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");
		for (int i = 0; i < score.length; i++) {
			int sum = 0; //sum 초기화
			char grade=' '; //grade 초기화
			
			System.out.printf("%d\t",i+1); //번호 출력
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("%d\t",score[i][j]); //국영수 점수 출력
				sum+= score[i][j];
			}
			double avg = sum/score[i].length;
			if(avg > 90) {
				grade='A';
			}else if(avg >80)
				grade='B';
			else if(avg > 70)
				grade='C';
			else if(avg > 60)
				grade='D';
			else {
				grade='F';
			}
			System.out.printf("%d\t%.1f\t%c%n", sum, avg, grade); //총점 평균 등급 출력
		} //end outer for()
		
	}
}
