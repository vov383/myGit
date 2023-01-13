package ch10;

public class PolyEx {

	public static void main(String[] args) {
		//memberVar : type 전부 다름.
		int a=10;
		double b=20.1;
		char c ='A';
		String d = "hello";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		System.out.println("====");
		
		//한개의 자료형으로 다양한 형태의 자료형을 처리할 수 있는 능력을 다형성이라 한다.
		//Object type 하나로 정수, 실수, 문자, 문자열 모든 데이터 타입 다 다룰 수 있음.
		//Object는 최상위 클래스.
		//왜 type을 다 지정해? 그대로 사용하면 프로그램 무거워져. 속도 저하. 메모리 사용량 Up
		
		Object o = "java"; 
		System.out.println(o);
		
	}
}
