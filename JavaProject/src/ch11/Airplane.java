package ch11;
//클래스 생성할 때 interfaces 부분에 Add 해주면 자동으로 메서드까지 추가해준다. 
public class Airplane implements Flyer {

	@Override
	public void takeOff() {
		System.out.println("Airplane 이륙");
	}

	@Override
	public void fly() {
		System.out.println("Airplane 비행");

	}

	@Override
	public void lnad() {
		System.out.println("Airplane 착륙");

	}

}
