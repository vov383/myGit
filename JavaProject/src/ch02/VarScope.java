package ch02;

public class VarScope {// 클래스

	static int x; // 전역변수, (멤버변수, 필드변수), 선언만. 값 초기화 안했는데 0이 들어가 있네.
	
	
	
	public static void main(String[] args) { // 메서드
		// 
	int y =0; // 지역변수
	
	System.out.println("x = "+ x);
	System.out.println("y = "+ y);
	
	int x = 5;
	double pi = 3.14;
	
	System.out.printf("x= %d and pi %f\n", x, pi);
	}

}
