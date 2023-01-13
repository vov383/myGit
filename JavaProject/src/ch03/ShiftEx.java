package ch03;

public class ShiftEx {

	public static void main(String[] args) {
		//shift 연산자 연습.
		int a = 2; //이진수 0010
		
		//값을 좌측으로 2bit(2칸) shift(밀어낸다)
		int b = a << 2; //이진수 1000
		System.out.println(b); //8 == 이진수 1000 == 2*2^2
		
	}
}
