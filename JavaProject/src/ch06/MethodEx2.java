package ch06;
//메서드를 정의하고 간결하게 코딩.
//MethodEx1 과 비교. 결과물은 동일함.
public class MethodEx2 {

	public static void main(String[] args) {
		System.out.println("합(1~10) : " + sum(1,10));
		System.out.println("합(1~100) : " + sum(1,100));
		System.out.println("합(100~1000) : " + sum(100,1000));
	}
	//사용자 정의 메서드
	public static int sum(int a, int b) {
		int sum=0;
		for (int i = a; i <= b; i++) {
			sum+=i; //누적
		}
		return sum;
	}
}
