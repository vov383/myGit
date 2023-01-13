package ch03;
//double 타입으로 선언한 변수에 int 자료를 담으면 => 묵시적
//float 타입의 자료를 int 로 선언한 변수에 담으려면 => 명시적 형변환 하여야

public class CastEx2 {

	public static void main(String[] args) {
		
		//
		int a = 500;
		float b = 200.2f;
		int c = 129;
		
		double d = a; //묵시적 형변환 //데이터 타입 달라도
		System.out.println("int a => double : " + d);
		
		int e = (int)b; //명시적 형변환
		System.out.println("float b => int : " + e);
		
		// byte는 -128~127까지 받을 수.
		byte f = (byte)c;
		System.out.println("int c => byte : " + f); //-127 출력됨.
	}
}
