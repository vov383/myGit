package ch13;

public class WrapperEx {

	public static void main(String[] args) {
		
		Integer i1 = 10;//간편
		Integer i2 = new Integer(20);//정석
		int num1 = i1.intValue();//정석 언박싱
		int num2 = i2;//오토언박싱 //객체로 포장된 value를 꺼내는 작업
		
		int sum = num1+num2;
		System.out.println(sum);
		
		//2진수를 문자열로
		System.out.println(Integer.toBinaryString(sum));//2진수로 변환 => 출력
		System.out.println(Integer.toOctalString(sum));//8진수로
		System.out.println(Integer.toHexString(sum));//16진수로
		System.out.println(Integer.MAX_VALUE);//정수의 최대값 //정수 primitive data type의 범위
		System.out.println(Integer.MIN_VALUE);//최소값
		
		//data type 바꾸기
		System.out.println(Integer.parseInt("100"));//문자열을 숫자로
		System.out.println(Integer.toString(100));//숫자를 문자열로
		System.out.println(100+"");//숫자를 문자열로 처리하는 방법. +연산자에 문자열 있으면 숫자도 문자열로 변환됨.
		
		
		
		
	}
}
