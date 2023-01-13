package ch04;
/*
별찍기 
계단모양
역삼각형으로

별이 찍히는 과정 순차적으로 이해하기.
 */
public class Star {

	public static void main(String[] args) {
		//별찍기 계단
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println(); //줄바꿈
	
		}
		
		System.out.println(); //개행
		
		//계단 역순
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
	
		}
		
	}
}
