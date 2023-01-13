package ch03;

public class CompareEx {

	//== 와 = 헷갈리지 않도록	//!= 연산자
	public static void main(String[] args) {
		int a = 65;
		char c = 'A'; //아스키값이 65
		System.out.println( a == c); //비교연산자
		System.out.println( a = c); //대입연산자
		System.out.println( c != 65 ); //not Equal
	}
}
