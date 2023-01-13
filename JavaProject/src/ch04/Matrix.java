package ch04;
/*
중첩 for문으로 행렬 만들기.
중첩으로 쓸때는 변수 i j 다르게 설정해야.
pinrtf() 출력하기
 */
public class Matrix {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.printf("[%d,%d]",i,j);
			}
			System.out.println();
		}
		
	}
}
