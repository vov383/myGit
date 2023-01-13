package ch13;

public class WrapDouble {

	public static void main(String[] args) {
		Double num0 = new Double('a');
		Double num1 = new Double(11.5);//객체자료형
		double num2 =3.5;//기본자료형
		double num3 = num1/num2;//auto unboxing //type을 안 맞춰도 에러 안나게 하는 오토박싱 오토언박싱
		System.out.println(num0);
		System.out.println(num3);
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		String str = "11.5";
		System.out.println(str+200);//문자열을 연결
		System.out.println(Double.parseDouble(str)+200);//값과 값 연산
		
	}
}
