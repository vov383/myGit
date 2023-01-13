package ch13;
//12-30 과제2
public class AutoBox2 {
	public static void main(String[] args) {
		
		int num1 = 30;
		int num2;
		
		Integer i1 = num1;
		Integer i2 = new Integer(i1+10);
		num2 = i2;
		
		int num3 = (num1 / 3)+ i2;
		Integer i3 = new Integer(num3);
		
		System.out.println("기본자료형 : "+num1+", 참조자료형 : "+i1);
		System.out.println("기본자료형 : "+num2+", 참조자료형 : "+i2);
		System.out.println("기본자료형 : "+num3+", 참조자료형 : "+i3);
	}
}
