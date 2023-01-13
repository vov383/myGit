package ch11;
//12-29 과제2.
public class NoteBook implements Controllable {

	@Override
	public void turnOn() {
		System.out.println("노트북을 켠다.");
	}

	@Override
	public void turnOff() {
		System.out.println("노트북을 끈다.");

	}

}
