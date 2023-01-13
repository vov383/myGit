package ch04;

import java.util.Scanner;

public class ForPoint {
/*
12-16 과제
3사람의 성적 스캐너로 입력받아 아래처럼 출력
for문 if문 Scanner() 활용
등급은 수우미양가

 */
	public static void main(String[] args) {
		int kor;
		int eng;
		int mat;
		
		String result="";
		
		//점수입력
		for(int i=1; i<=3; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("국어점수를 입력하세요 : ");
			kor = sc.nextInt();
			System.out.print("영어점수를 입력하세요 : ");
			eng = sc.nextInt();
			System.out.print("수학점수를 입력하세요 : ");
			mat = sc.nextInt();
		
			int tot = kor + eng + mat;
			double avg = tot/3.0;
			avg = Math.round(avg*100)/100.0;
			char grade =' ';
			// if문으로 grade 먹이면 될 거 같네
				if(avg >90) {
					grade = '수';
				} else if(avg > 80) {
					grade = '우';
				} else if(avg > 70) {
					grade = '미';
				} else if (avg>60) {
					grade ='양';
				} else {
					grade ='가';
				}
				//출력하기 문자열 누적시키는 기법 활용
				result += kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg+"\t"+grade+"\n"; //문자열 누적시키는 법.
		} //end for
		
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println(result);
	}
	
}
