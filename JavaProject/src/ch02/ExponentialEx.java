package ch02;

public class ExponentialEx {
	//실수를 자연 표기법으로 표기해라
	public static void main(String[] args) {
		//수학 기초가 부족해서 쪼금 헷갈리네...
		double d = 123.456;
		System.out.printf("%e\n", d);
		
		double d2 = 0.00314;
		System.out.println(String.format("%e\n", d2));
	}
}
