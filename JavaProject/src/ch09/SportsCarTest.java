package ch09;

public class SportsCarTest {

	public static void main(String[] args) {
		SportsCar obj = new SportsCar();
		//상속받았기 때문에 부모클래스도 sub 객체 생성할 때 자동 생성된다. 
		//부모의 멤버들 모두 사용 가.
		
		obj.speed = 10; //Car 객체 멤버변수 초기화
		obj.setSpeed(60); //Car 객체 멤버메서드 호출
		obj.setTurbo(true); // SportsCar 객체 멤버 메서드 호출
	}
	
}
