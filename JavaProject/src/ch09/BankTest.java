package ch09;

class Bank {
	double getInterestRate() { //Bank의 멤버 메서드
		return 0.0;
	}
}

class BadBank extends Bank{
	
	@Override //생소한 기호. //어노테이션(Anootation). 컴파일러에 추가적 정보 제공. metaData
	//일종의 주석으로 활용. 	//프로그램에 특정 기능을 정의하거나 실행하도록. //정보 제공용.
	//spring 에서는 본격적으로 활용.
	double getInterestRate() { //ctrl space로 자동완성. //메서드 오버라이딩 => 헤더 그대로 카피. 바디 재정의. 
		return 10.0;
	}
}

class NormalBank extends Bank {
	@Override
	double getInterestRate() {
		return 5.0;
	}
}

class GoodBank extends Bank {
	@Override
	double getInterestRate() {
		return 3.0;
	}
}


public class BankTest {
	public static void main(String[] args) {
		BadBank b1 = new BadBank(); //객체 생성(주목적). 기본생성자 호출.
		NormalBank b2 = new NormalBank();
		GoodBank b3 = new GoodBank();
		System.out.println("BadBank의 이자율 :"+ b1.getInterestRate());
		System.out.println("NormalBank의 이자율 :"+ b2.getInterestRate());
		System.out.println("GoodBank의 이자율 :"+ b3.getInterestRate());
		
		
		
	}
}
