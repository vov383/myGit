package ch10;

public class StaticExam {

	public static void main(String[] args) {
		int a = 40, b = 30, result;
		result = Math.max(a, b); // 둘 중 큰값.

		
//		  Math 클래스는 member 전부 static static은 어디에 주로 많이 써? 대표적으로 많이 자주 사용하고 고정된
//		  값들은static을 사용한다.
//		  
//		  개별적인 값을 사용할 때 non-static 공통적인 값을 사용할 때 static
		  
		 
		System.out.println(result);
		result = Math.min(a, b);
		System.out.println(result);
		System.out.println(Math.sqrt(100)); // 제곱근

		double r = 15.3;
		System.out.println("원의 둘레 : " + 2 * Math.PI * r);
		System.out.println("원의 넓이 : " + Math.PI * r * r);
	}
}
