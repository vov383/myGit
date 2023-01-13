package ch05;

import java.util.Scanner;

/*
 * 12-19 과제
Scanner 와 배열 활용
2명의 학생의 국영수 점수를 각각 입력.
 */
public class ArrayPoint2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] name;
		name = new String[2];
		
		int[] kor = {0,0};
		int[] eng = {0,0};
		int[] mat = {0,0};	
		int[] tot = {0,0};
		double[] avg = {0,0};
		int tot_avg =0;
		System.out.println("2명의 학생의 국 영 수 점수를 각각 입력하세요. ");
		
		for(int i=0; i<2; i++) { //int i 변수 선언할 때 데이터 타입 빼먹지 말것.
			System.out.print("이름을 입력하세요 : ");
			name[i] = sc.next();
			System.out.print("국어점수 : ");
			kor[i] = sc.nextInt();
			System.out.print("영어점수 : ");
			eng[i] = sc.nextInt();
			System.out.print("수학점수 : ");
			mat[i] = sc.nextInt();
			tot[i] = kor[i] + eng[i] + mat[i];
			avg[i] = tot[i]/3.0;
			tot_avg += avg[i];
		}
		sc.close();
		
		for(int i=0; i<2; i++) {
			System.out.println("이름 : "+name[i]);
			System.out.println("국어 : "+kor[i]);
			System.out.println("영어 : "+eng[i]);
			System.out.println("수학 : "+mat[i]);
			System.out.println("총점 : "+tot[i]);
			System.out.println("평균 : "+String.format("%.2f", avg[i]));
			
		}
		
		
		System.out.println("===================");	
		System.out.println("학급평균 : " + tot_avg);
	} //end main
}
