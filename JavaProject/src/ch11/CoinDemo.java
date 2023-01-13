package ch11;

public class CoinDemo {
	//인터페이스는 생성이 안되는데 왜 '인터페이스명.상수명' 으로 처리 가능할까?
	//자동으로 static final 선언 되니까
	//생성 안해도 static 메모리 영역에 올라와 있다. 
	
	public static void main(String[] args) {
		System.out.println("Dime은 "+Coin.DIME + "센트입니다.");
		System.out.println("Dime은 "+Coin.NICKEL + "센트입니다.");
		System.out.println("Dime은 "+Coin.QUARTER + "센트입니다.");
	}
}
