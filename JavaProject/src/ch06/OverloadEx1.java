package ch06;

public class OverloadEx1 {

	public static void main(String[] args) {
		print(10.5);
		print("hello");
		print(100);
		print("Hi", "Java");
	}
	//메서드 오버로딩
	//1) 메서드 이름 같고
	//2)-1 매개변수의 개수 다르거나
	//2)-2 매개변수 개수 같으면 데이터 타입이 달라야
	static void print(double a) { //매개변수 1개 double
		System.out.println(a);
	}
	static void print(String b) { //매개변수 1개 String
		System.out.println(b);
	}

	static void print(int n) { //매개변수 1개 int
		System.out.println(n);
	}
	
	static void print(String a, String b) { //매개변수 2개 
		System.out.println(a+b); //두 개 짜리는 따로 출력되도록
	}
}
