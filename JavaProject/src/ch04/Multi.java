package ch04;
/* 곱하기 반복문
 * 
 * 
 */
public class Multi {
	public static void main(String[] args) {
		long num = 10;
		long sum = 1; //곱한 값을 저장할 변수
		for(int i=1; i<=num; i++) {
			sum *= i;
		}
		System.out.println("1~"+num+" 까지의 곱 : "+ sum);
	}
}
