package ch02;

public class Interpret {

	public static void main(String[] args) {
		int a;
		int b;
		int tot;
		
		
		  a=1; 
		  b=2;
		  tot = a + b;
		// 순차적 처리. interpret 방식이기 대문에.
		// 연산 한 이후에 초기화 하는 것 안돼. 초기화 순서 중요함.
		  
		System.out.println(tot);

	}

}
