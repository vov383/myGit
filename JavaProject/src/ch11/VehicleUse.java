package ch11;
//12-29 과제1
public class VehicleUse {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.speedUp();
		c.speedDown();
		c.handle();
		
		Plane p = new Plane();
		p.speedUp();
		p.speedDown();
		p.handle();
		
		Boat b = new Boat();
		b.speedUp();
		b.speedDown();
		b.handle();
	}
}
