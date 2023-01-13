package ch11;

public class TV implements Controllable, RemoteControllable {
//인터페이스 2개를 implements
	
	@Override
	public void remoteOn() {
		System.out.println("리모컨으로 tv를 켠다.");
	}

	@Override
	public void remoteOff() {
		System.out.println("리모컨으로 tv를 끈다.");

	}

	@Override
	public void turnOn() {
		System.out.println("tv를 켠다.");

	}

	@Override
	public void turnOff() {
		System.out.println("tv를 끈다.");

	}

}
