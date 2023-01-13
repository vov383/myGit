package ch06;
/*
 * 매개변수 숫자가 계속 늘어날 때마다 다시 만들어야해?
 */
public class VariantParam {

	public static void main(String[] args) {
		print("java");
		print("java", "program");
		print("java", "program", "jsp");
		print("java", "program", "jsp", "big", "data");
	}
	
	//자료형 ... 변수 => 가변사이즈 매개변수, 변수가 배열참조 변수가 됨.
	//같은 자료형의 매개변수의 갯수에 관계없이 처리
	//매개변수들이 배열로 저장됨.
	//사용 빈도는 낮음.
	static void print(String ... n) { //n은 가변형 매개변수(배열처리의 주소값)가 됨.  
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
		System.out.println("==========");
	}
}	
//	static void print(String a, String b, String c) {
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//	}
//
//	static void print(String a, String b) {
//		System.out.println(a);
//		System.out.println(b);
//	}
//
//	static void print(String a) {
//		System.out.println(a);
//	}

