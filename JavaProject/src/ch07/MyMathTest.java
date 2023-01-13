package ch07;

public class MyMathTest {

	public static void main(String[] args) {
		MyMath obj = new MyMath(); //객체 타입(); 이게 생성자, constructor
		System.out.println(obj.square(10));
		System.out.println(obj.square(3.14));
	}
}
