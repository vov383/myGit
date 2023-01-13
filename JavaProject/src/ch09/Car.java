package ch09;

public class Car {

	int speed;
	public void setSpeed(int speed) { //속도 변경 메서드
		this.speed = speed; //지역변수와 멤버변수가 같을 때 멤버변수 앞에 this. 써주어야.
		System.out.println(speed);
	}
	
}
