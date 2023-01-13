package ch02;

public class TypeMissmatch {

	public static void main(String[] args) {

		byte n;
		n = 127; //byte 가 수용할 수 있는 값은 -128~127까지.
				// 300 넘으니까 에러남.
		System.out.println(n);
	}

}
