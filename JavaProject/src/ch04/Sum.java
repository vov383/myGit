package ch04;
/*
 * += 로 누적시키기
 * printf() 로 포맷 지정해서 출력.
 */
public class Sum {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i; //해석 sum = sum + i;
			System.out.printf("1부터 "+i+"까지의 정수의 합 = %d\n", sum);
		}
	}
}
