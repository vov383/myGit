package ch04;
/*
 * for문 초기식에 변수 두개 넣을 수
 * 증감식도 변수 개수 맞게 두개 넣을 수
 */
public class For_Ex3 {
	public static void main(String[] args) {
		for(int i=1, j=10; i<=10; i++, j--) { //초기식에 변수 2개 넣을 수, 조건식은 평범하게, 증감식도 두개
											  // 흔치 않은 기법. 이렇게도 할 수 있구나 정도로.
			System.out.printf("%d \t %d\n", i, j);
		}
		
	}
}
