package ch09;

public class SportsCar extends Car { //Car 클래스 상속관계 만듬.
	boolean turbo; //SportsCar의 멤버변수

	public void setTurbo(boolean flag) { //turbo 모드 설정 메서드  
		turbo = flag; //변수 이름 다르면 this 안 써도 됨. 
		System.out.println(turbo);
	}
}
