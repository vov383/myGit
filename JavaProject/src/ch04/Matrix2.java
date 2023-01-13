package ch04;
/*
중첩for 와 if else 를 적절히 섞어서 이렇게도 출력할 수 있다.
 */
public class Matrix2 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i==j) {
					System.out.printf("[%d, %d]", i, j);
				}else {
					System.out.printf("%5c", ' '); //c는 단문자 출력 형식지정자. 
				} //if ~ else
			} //inner for
			System.out.println();
		} //outer for
	} //main
}
