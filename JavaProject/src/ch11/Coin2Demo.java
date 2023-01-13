package ch11;

public class Coin2Demo implements Coin { 
	//implements 해도 된다. 어차피 추상메서드 없어서 에러도 안난다.

	public static void main(String[] args) {
		
		System.out.println("Dime은 " + Coin.DIME + "센트입니다.");
	}
}
