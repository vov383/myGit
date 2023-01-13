package ch06;

public class AbsEx {

	public static int abs(int num) {
		return num>0 ? num : -num; //3항 연산식 ==> 조건식 ? true false;
	}
	public static void main(String[] args) {
		int a = -15;
		System.out.println(a);
		System.out.println(abs(a)); //abs() 메서드 호출
		System.out.println(Math.abs(a)); //Math 클래스의 abs() 활용. //F3 누르면 alt 마우스 클릭과 같음.
	}
}
