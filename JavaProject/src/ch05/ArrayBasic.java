package ch05;


public class ArrayBasic {

	public static void main(String[] args) {
		
		int[] score; //배열 참조변수 선언. 배열참조변수를 활용하겠구나.
		score = new int[5]; //int 자료형. 4byte 5개의 메모리 자리를 준비해라.
		//배열 생성(4byte x 5 = 20byte)
		System.out.println(score); //메모리 주소값이 출력됨.
		score[0] = 100;
		score[1] = 90;
		score[2] = 80;
		score[3] = 70;
		score[4] = 60;
//		score[5] = 50; //배열 칸 넘어가면 에러 java.lang.ArrayIndexOutOfBoundsException
		
		
		//배열 안의 데이터 가져오기.
//		System.out.println(score[0]);
//		System.out.println(score[1]);
//		System.out.println(score[2]);
//		System.out.println(score[3]);
//		System.out.println(score[4]);
	
		//이렇게 하면 반복적인 패턴이 보인다.
		//for문 활용. 배열 활용에 for문은 필수.
		for(int i=0; i<score.length; i++) {
			System.out.println(score[i]);
		}
		int[] score2 = {100, 90, 80, 70, 60};
		for(int i=0; i<score2.length; i++) {
			System.out.println(score2[i]);
		}
	}
}
