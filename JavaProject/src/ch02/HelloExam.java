package ch02;


/**
 * @author 성유석.
 * @version 1.0 2022-12-13
 * 
 */
public class HelloExam {

	
	// 사용자 정의 메서드.
	public static int sum(int n, int m) {	// 메서드 // 매개변수.
		return n + m;
	}
	// 항상 프로그램은 메인 메서드부터 실행.
	public static void main(String[] args) {	// 메인 메서드. 실행 메서드. 
		int i = 20;		// 지역 변수 초기화(할당)(저장).
		int s;			// 지역 선언만. 지역변수와 전역변수.  
		char a;			// 선언만.
		
		s = sum(i, 10);		// i 는 그릇. 정수형 변수를 받을 수 있어. 여기에 20이 저장되어 있어. 이걸 n 으로 보내. n = 20, m = 10, 지역변수를 던지면 매개변수가 받음. s=30 으로 초기화. 
		a = '?';			
		System.out.println(a);	// 단문자는 ''로 넣는다. 기호도.  // 변수 초기화. 
		System.out.println("Hello");
		System.out.println(s);
	}	// 메인 메서드의 마지막 블럭은 프로그램 종료. 

}
