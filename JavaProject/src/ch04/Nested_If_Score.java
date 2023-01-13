package ch04;
//12-15 과제
//if else if문. 
//조건문 안에 조건을 또 넣어서 결과값이 달라지게
//Scanner 로 입력 받기
import java.util.Scanner;

public class Nested_If_Score {

	public static void main(String[] args) {
		int score;
		char grade = ' ';
		char lev = '0'; //A0, B0 처리
		
		Scanner sc = new Scanner(System.in);
		System.out.print("java 점수 : ");
		score = sc.nextInt();
		sc.close();
		
		//출력
		if(score > 80) {
			grade = 'A';
			if( score > 90) {
				lev = '+';
			}else if (score < 85) {
				lev = '-';
			}
		}else if (score > 60) {
			grade ='B';
			if(score > 70) {
				lev ='+';
			}else if (score < 65) {
				lev ='-';
			}
		}else {
			grade ='F';
			System.out.println("재수강 대상입니다.");
		}
		
		System.out.println("당신의 점수는 "+score+" 이고 등급은 "+grade+lev+" 입니다.");
	}
}
