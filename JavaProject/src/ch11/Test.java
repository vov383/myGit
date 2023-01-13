package ch11;

public abstract class Test { //추상 클래스(한개라도 추상메서드가 존재하면 추상클래스 됨.)
	public void input() { //일반 메서드
		
	}
	
	public abstract void print(); //일반 class에 abstractMethod 만들려고 하니까 에러남. class abstract 처리 하여야.
	
}

