package ch04;
/*
 * for문을 이용해서 *찍기
 */
public class For_For {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) { //5번 반복, (outer for문) 
			//중첩for문은 변수사용에 유의하여야, 다른 변수를 사용
			for(int j=1; j<=5; j++) { //중첩for문(inner for문)
				System.out.print("*"); //j가 6이 되기 전까지 *을 찍음. 5번
			} //inner for
			//줄바꿈 위치가 어디냐에 따라 결과값이 달라져.	
			System.out.println(); //줄바꿈 //i가 6이 될 때마다 줄바꿈 찍힘.
		} //outer for
	} //end main() : 프로그램 종료. 
	
}
