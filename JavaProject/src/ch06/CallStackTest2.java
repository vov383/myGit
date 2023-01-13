package ch06;
//메서드 실행 순서 명확하게 출력문으로
public class CallStackTest2 {

	public static void main(String[] args) {
		System.out.println("main(String[] args) 시작되었음");
		firstMethod();
		System.out.println("main(String[] args) 끝");
	}

	private static void firstMethod() {
		System.out.println("firstMethod() 시작되었음.");
		secondMethod();
		System.out.println("firstMethod() 끝");
	}

	private static void secondMethod() {
		System.out.println("secondMethod() 가 시작되었음");
		System.out.println("secondMethod() 끝");
	}
}
