package ch12;

import ch11.Flyer;

public class InnerUse {
	public static void main(String[] args) {

		Flyer f = new Flyer() { //무명클래스. 코드형태 => new 생성자() {};

			@Override
			public void takeOff() {
				System.out.println("takeOff");
			}

			@Override
			public void lnad() {
				System.out.println("land");
			}

			@Override
			public void fly() {
				System.out.println("fly");
			}
		}; //end anonymousClass
		f.takeOff();
		f.fly();
		f.lnad();
	}

}