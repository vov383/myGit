package ch03;
//증감연산자 ++ --

public class SignIncresemntDemo {
	
	public static void main(String[] args) {
		
		int plusOne =1;
		int minusOne = -plusOne;
		System.out.println("plusOne은 "+plusOne+ "입니다.");
		System.out.println("minusOne은 "+minusOne+ "입니다.");
		
		int x=1, y=1;
		System.out.println("x = " + x + ", ++x = " + ++x);//연결 연산자, 증감연산자.
		System.out.println("y = " + y + ", y++ = " + y++);//후위연산자가 증가감연산자일 경우 
		System.out.println("x = " + x + ", y = " + y);		// 다음 줄에서는 연산 반영.
	}
}
