package ch12;

interface RemoteControll {
	void turnOn();
	void turnOff();
}


public class AnonymousClassTest {
	public static void main(String[] args) {
		
		//interface는 new해서 객체 생성 can`t 
		//아래처럼 무명클래스 처리하면 자동적으로 인터페이스를 무명클래스가 상속받아.
		//오버라이딩 처리 can
		RemoteControll ac = new RemoteControll() { //익명클래스.
			
			@Override
			public void turnOn() {
				System.out.println("TV turnOn()");
			}
			
			@Override
			public void turnOff() {
				System.out.println("TV turnOff()");
			}
		}; //ctrl + space 로 자동완성 기능 사용하면 이클립스가 자동으로 만들어줌
		//{코드블록}; 끝에 세미콜론(;) 있으니 익명 클래스임을 알 수.
		ac.turnOn(); //부모쪽 참조변수로 자식쪽 메서드에 접근. 다형성 기법
		ac.turnOff();
	}
	
	
	
	
	
}
