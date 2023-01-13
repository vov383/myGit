package ch08;

public class CalculatorUse {
	
	public static void main(String[] args) {
		Calculator c1 = new Calculator(); //객체생성. 동시에 컴파일러가 기본 생성자 호출함. 
		//기본생성자 호출됨. 눈에 안 보이게 처리됨.
		System.out.println(c1);
		//입력
		c1.setLeft(10);
		c1.setRight(20);
		
		//출력
		System.out.println(c1.getLeft());
		System.out.println(c1.getRight());
		c1.sum();
		c1.avg();
		
		
		Calculator c2 = new Calculator(10, 20); //c1이랑 메모리 주소 달라. 다른 인스턴스.
		System.out.println(c2);
		c2.sum();
		c2.avg();
		
		
		Calculator c3 = new Calculator(20, 40);
		System.out.println(c3);
		c3.sum();
		c3.avg();
	}
}
