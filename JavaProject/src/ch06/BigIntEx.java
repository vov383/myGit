package ch06;
//BigInteger. long도 감당 못하는 천문학적인 숫자도 감당하게 만든다.
import java.math.BigInteger;

public class BigIntEx {

	static BigInteger factorial(int n) {
		BigInteger fac = BigInteger.ONE; //ONE은 1임.
		for (int i = 1; i <=n; i++) {
			fac = fac.multiply(BigInteger.valueOf(i));
		}
		return fac;
	}
	
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) { // 1부터 100까지 팩토리얼 계산
			System.out.println(i+ "팩토리얼="+factorial(i));
			System.out.println("-------------------------");
		}
	}
}
