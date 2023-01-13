package ch03;
//println()
//printf() 차이점.

public class CastEx3 {

	public static void main(String[] args) {
		
		//println()문과는 달리 printf()에서는 결과값을 %.1f로 실수형으로 지정핺은 경우
		//반드시 연산결과가 실수값으로 나와야 하기 때문에 
		//형변환 연산자인 (double)을 명시적으로 써야 실수형으로 맞춰 줘야한다.
		int x = 8;
		int y = 5;
		System.out.println("x/y= "+ x/y); //나눈 몫
		/*
		System.out.printf("x/y=%.1f", x/y); //Run 하면 IllegalFormatConversionException //
											//실수형 자료면 반드시 type 맞추어야. 명시적 형변환 필요.
		*/
		System.out.printf("x/y=%.1f", (double)x/y); //명시적 형변환 //실수형으로
		
	}
}
