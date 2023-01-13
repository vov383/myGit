package ch05;
/*
2차원배열
[][] 배열첨자 2개를 쓴다.
행렬의 개념
3행 3렬의 2차원 배열 만들기
{} 안에 {} 행으로 쓸 블럭 하나 둘 셋. 3렬 
 */
public class Array2 {

	public static void main(String[] args) {
		//실무 타입 - 우리가 이렇게 쓰면
//		int num[][] = {{10,20,30},{40,50,60},{70,80,90}}; 
		
		//정석 타입 - 컴퓨터가 이렇게 처리한다.
		int[][] num;
		num = new int[3][3];
		num[0][0]=10;
		num[0][1]=20;
		num[0][2]=30;
		num[1][0]=40;
		num[1][1]=50;
		num[1][2]=60;
		num[2][0]=70;
		num[2][1]=80;
		num[2][2]=90;

		System.out.println();
//	이게 두 개가 들어갔어. 어디서 많이 본듯한 구조.
//	구구단같다.
		//2중 for문
		for(int i=0; i<num.length; i++) { //행 처리
			for(int j=0; j<num.length; j++) { //열 처리
				System.out.println(num[i][j]);
			}
		}
	}
}
