package ch11;

public abstract class AbstractClass { //하나라도 abstract method 있으면 class 도 abstract 해주어야 한다.
	//추상클래스는 인터페이스에 비해 추상화 정도 약하다.
	
	void method2() {
		System.out.println("완성된 method");
	}
	
	abstract void method1(); //추상메서드. Body 없어. 일반 클래스에 만들면 error
}
