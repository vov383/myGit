package ch06;
//메서드 없이 코딩해서 메서드 필요성 알아보자.
//똑같은 코드를 복붙...
public class MethodEx1 {

	public static void main(String[] args) { //메서드 사용하지 않는 경우.
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}
		System.out.println("합계(1~10 : "+sum);
		
		sum=0;
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
		System.out.println("합계(1~100 : "+sum);
		
		sum=0;
		for (int i = 100; i <= 1000; i++) {
			sum += i;
		}
		System.out.println("합계(1~100 : "+sum);
	
	
	}
		
		
	
}
