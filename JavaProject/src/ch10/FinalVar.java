package ch10;

public class FinalVar {

	//final을 변수에 적용하면 상수화.
	final static int MAX_NUM=500; //상수처리. //보통 상수는 static으로 쓴다.
	
	
	public static void main(String[] args) {
		
		int max=100;
		System.out.println(max);
		System.out.println(MAX_NUM);
//		MAX_NUM = 200; //final variable은 수정할 수 없어.
	}
	
}
