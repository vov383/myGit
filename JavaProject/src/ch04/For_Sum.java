package ch04;
/*
 * if문 for문 결합
 * for문 안에 if문
 * (i%10==0)==> i 값이 10의 배수일 때마다
 */

public class For_Sum {
	public static void main(String[] args) {
		int total=0;
		for(int i=1; i<=100; i++) { //반복문
			total += i;
			if((i%10)==0) { //조건문 //i가 10까지 더할 때마다
				System.out.println("  1부터 "+ i + "까지의 자연수 합계는 " + total);
			}
		}
	}
}
