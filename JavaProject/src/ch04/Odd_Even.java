package ch04;
/*
 * for문과 if문 활용해서 짝수 홀수 합 출력하기
 * i%2==1 ==> 홀수
 * i%2==0 ==> 짝수
 */
public class Odd_Even {
	public static void main(String[] args) {
		int sum1=0;
		int sum2=0;
		for(int i=1; i<=10; i++) { //10번 반복
			if(i%2==1) {
				sum1 += i; // sum1 = sum1 + i
			} //if문
		} //for문
		System.out.println("1~10사이의 홀수의 합은? "+sum1);
		
		
		
		for(int j=1; j<=10; j++) { //10번 반복
			if(j%2==0) {
				sum2 += j; // sum1 = sum1 + j
			} //if문
		} //for문
		System.out.println("1~10사이의 짝수의 합은? "+sum2);
	} //main method
	
}
