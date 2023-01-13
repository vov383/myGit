package ch11;

public class FlyUse {
	public static void main(String[] args) {
		
		Bird bird = new Bird();
		bird.takeOff();
		bird.fly();
		bird.lnad();
		
		Airplane air = new Airplane();
		air.takeOff();
		air.fly();
		air.lnad();
		
		//다형성 => 좌 : 부 , 우 : 자. 
		//하나의 참조변수로 여러 객체에 접근 가능. //단 상속관계여야. //부모 참조변수로 자식 객체들 접근 가능. 
		Flyer f = new Bird();
		f.takeOff(); 
		f.fly();
		f.lnad();
	}
}
