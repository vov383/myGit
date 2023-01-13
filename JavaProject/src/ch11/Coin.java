package ch11;

public interface Coin {
	//interfacce는 상수에 자동으로 public static final 안 붙여도 된다.
	//대문자로 써서 상수 된건가? 아니면 변수선언해도 상수가 되는건가??
	//int money; 변수 선언해도 상수가 되어버림.
	
	//미국 주화. 1penny = 1cent, 1nickel=5cents, 1dime = 10cents, 1quarter = 25cents
	int PENNY = 1, NICKEL = 5, DIME = 10, QUARTER = 25; 
	
	
	
	
}
