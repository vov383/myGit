package ch06;

public class CallStackTest {

	public static void main(String[] args) {
		firstMethod(); //메인 실행. firstMethod 호출 => secondMethod 호출 => 실행 => 더이상 메인에 코드 없어 => 프종
	}
	
	static void firstMethod() {
		secondMethod();
	}

	static void secondMethod() {
		System.out.println("secondMethod()");
	}
}
