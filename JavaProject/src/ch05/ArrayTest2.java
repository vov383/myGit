package ch05;

public class ArrayTest2 {

	public static void main(String[] args) {
		int sum=0;
		float average = 0f; //float 자료형은 f 처리 할 것. 반드시.
		int[] score = {100, 88, 100, 100, 90};
		for(int i=0; i<score.length; i++) {
			sum += score[i]; //sum = sum+score[i]
		}
		average = sum/(float)score.length; //자료형 맞춰서 캐스팅. 계산 결과를 float으로 얻기 위해서
		
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+average)
		;
	}
}
