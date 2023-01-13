package ch06;

public class RecyrsuveEx {

	
	static long fact1(int n) {
	//재귀호출은 값의 크기가 커지기때문에 long타입으로
		return n==1 ? 1 : n * fact1(n-1); //재귀호출
	}
	
	/*
	static long fact2(int n) {
		long result=1;
		for (int i = 1; i <= n; i++) {
			result = result * i;
		}
		return result;
	}
	*/
	public static void main(String[] args) {
		System.out.println(fact1(5)); //5!=5x4x3x2x1
		System.out.println(fact1(25)); //long type은 25!까지만 소화가능 26!부터는 엉뚱한 값 나옴.
		
//		System.out.println(fact2(5));
		
	}
}
