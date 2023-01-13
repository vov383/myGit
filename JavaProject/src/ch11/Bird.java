package ch11;

public class Bird implements Flyer {

	@Override
	public void takeOff() {
		System.out.println("Bird 이륙");
	}

	@Override
	public void fly() {
		System.out.println("Bird 비행");

	}

	@Override
	public void lnad() {
		System.out.println("Bird 착륙");

	}

}
