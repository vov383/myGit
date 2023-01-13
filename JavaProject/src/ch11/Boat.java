package ch11;

public class Boat implements Vehicle {

	@Override
	public void speedUp() {
		System.out.println("Boat SpeedUp");
	}

	@Override
	public void speedDown() {
		System.out.println("Boat SpeedDown");

	}

	@Override
	public void handle() {
		System.out.println("Boat Handling");
	}

}
