package ch11;

public interface Flyer {

	//구현부 있으면 에러. interface 는 추상 method 만으로 구성됨. so, 구현부 없어야. 
	//파일 탐색창에서 인터페이스 클릭하고 F4 누르면 hierarchy 볼 수 있음.
	public void takeOff();
	public void fly();
	public void lnad();
	
}
