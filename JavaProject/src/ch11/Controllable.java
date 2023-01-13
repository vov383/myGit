package ch11;

public interface Controllable {
	//interface에서 일반 메서드 만들기.
	//default, static => jdk8부터 //private => jdk9부터
	
	//interface에서 명시적 default 메소드로의 구현은 jdk8부터 가능.
	default void repair() { //접근제어자 default 써서 일반 method 구현하기. //예외적 상황.
		System.out.println("장비를 수리한다.");
	}
	
	//인터페이스에서 static method 로의 구현은 jdk8부터 가능. 
	//단 실무에서 인터페이스에 굳이 구현부를 만들 이유는 없어.
	//실무에서 jdk 7을 쓰는 경우가 있기 때문.
	static void reset() { 
		System.out.println("장비를 초기화한다.");
	}
	
	//참고 : private 메서드로의 구현은 jdk9 부터 가능.
	//단 실무에서 인터페이스에서 구현 method 를 쓸 이유는 없다. 인터페이스의 목적을 생각해보면 당연함.
	//인터페이스는 표준화 목적이기 때문.
	
	void turnOn();
	void turnOff();
	
}
