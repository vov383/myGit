package ch07;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.changeGear(1); //Car의 gear를 1;
		myCar.speedUp(); //Car의 speed가 0이었는데 +10 해서 speed에 초기화. 10;
		System.out.println(myCar); //아까는 주소값이 나왔는데 지금은 Car [color=null, speed=10, gear=1] 출력.
	}
}
