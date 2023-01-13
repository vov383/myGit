package ch08;

class Circle {
	double radius;
	String color;
	
	//생성자 오버로딩.
	public Circle(double r, String c) {
		radius = r; //매개변수와 지역변수가 다르니까 this. 안 해도 된다.
		color = c;
	}
	public Circle(double r) {
		radius = r;
		color ="파랑";
	}
	public Circle(String c) {
		radius = 21.0;
		color = c;
	}
//기본생성자를 주석처리하고 run => 컴파일러가 안 만들어줘. 없는걸 호출하려고 하니까 에러남.
	//The constructor Circle() is undefined
	//습관적으로 기본생성자를 만들어두는 것도 좋다. 생성자를 만들어서 쓸 일이 많으니까.
	public Circle() {
		radius = 3.5;
		color = "빨강";
	}
	public void print() {
		System.out.println("반지름 : "+radius);
		System.out.println("색 깔 : "+color);
	}
}

public class CircleDemo {
	
	public static void main(String[] args) {
		Circle c1 = new Circle(10.0, "빨강"); //객체 생성 겸 멤버변수 2개짜리 생성자 호출
		c1.print();
		
		Circle c2 = new Circle(5.0);
		c2.print();
		
		Circle c3 = new Circle("노랑");
		c3.print();
		
		Circle c4 = new Circle(); //객체 생성 + 기본생성자 
		c4.print();
	}	
}
