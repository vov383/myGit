package ch11;

public interface RemoteControllable extends Controllable {
//인터페이스 끼리 부모 자식 관계. 상속 가능.
//인터페이스가 두개. 자식 클래스를 만들어보자. 
	
	void remoteOn();
	void remoteOff();
	
}
