package ch09;

public class Circle {
//접근 지정자 다르게 해보자.
	private void secret() {
		System.out.println("비밀이다.");
	}
	protected void findRadius() {
		System.out.println("반지름 구하기");
	}
	public void findArea() {
		System.out.println("넓이 구하기");
	}
	public Circle() { //기본 생성자(코딩해주는 습관은 좋다.
		
	}
	public Circle(int r) { //생성자는 상속의 대상 아니다. 
		System.out.println("반지름 : "+r);
	}
}
