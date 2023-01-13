package ch11;
//12-29 과제2
public class ControllableDemo {

	public static void main(String[] args) {
		
		NoteBook nb = new NoteBook();
		nb.turnOn();
		nb.turnOff();
		nb.repair();
		Controllable.reset();
		
//		Controllable.reset(); //static method는 클래스이름.메서드 이렇게 접근 가능. 

/*
		TV tv = new TV();
		tv.turnOn();
		tv.turnOff();
		tv.remoteOn();
		tv.remoteOff();
		tv.repair();
		
		Controllable.reset(); //static method() 클래스이름.메서드
		
		
		Computer c = new Computer();
		c.turnOn();
		c.turnOff();
		c.repair(); //부모쪽에 있으니까 사용 가능.
		
		Controllable.reset(); 
*/		
	}
}
