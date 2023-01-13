package ch02;

public class BooleanTest {

	public static void main(String[] args) {

		boolean b; //1bit, jvm이 1byte 삽입.
		b = true; // false 거짓
		System.out.println("b "+b );
		b=(1>2); // false 수식으로 조건식 처리.
		System.out.println("b "+b);
	}

}
