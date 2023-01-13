package ch07;

public class Car {

	String color;
	int speed;
	int gear;
	
	//개발자용 메서드
	@Override
	public String toString() { //println(객체명) ==> 현재 인스턴스가 가진 클래스의 맴버변수를 전부 출력.
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
	
	void changeGear(int g) { //g는 지역변수
		gear = g;
	}
	void speedUp() {
		speed += 10;
	}
	void speedDown() {
		speed -= 10;
	}
}
