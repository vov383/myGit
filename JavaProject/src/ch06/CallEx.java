package ch06;

public class CallEx {

	public static void test(int b) {
		System.out.println("test method 호출");
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		System.out.println("시작");
		int a = 10;
		test(a); //메서드 호출 데이터 타입 맞아. a값이 b에 들어가. 문자열 출력 10 출력
		test2(a); //메서드 호출. 데이터 타입 맞아. a값이 a에 들어가. 10출력. 
		System.out.println("끝"); 
	}

	private static void test2(int a) { //메서드 위치는 전혀 상관없다. 메인 위에 있건 아래에 있건...
		System.out.println(a);
	}
}
