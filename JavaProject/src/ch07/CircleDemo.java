package ch07;

public class CircleDemo {

	public static void main(String[] args) {
		
		Circle myCircle = new Circle();
		myCircle.radius = 10.0;
		//매개변수를 넣을 때 멤버변수를 호출해서 넣을 수 있고, 메서드를 호출해서 넣을 수도 있다.
		myCircle.show(myCircle.radius, myCircle.findArea()); //10.0, 314.0
	}
	
}
class Circle {
	//멤버변수
	double radius; //10.0
	
	//멤버 메서드
	double findArea() {
		return 3.14 * radius * radius; //3.14*10*10
	}
	void show(double x, double y) {
		System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x, y);
	}
	
}
