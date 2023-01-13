package ch09;

class Animal{
	public Animal(String s) {
		System.out.println("동물 : "+s);
	}
}

class Mammal extends Animal{
	public Mammal() { //ctlr space 로 기본생성자 자동완성
		// TODO Auto-generated constructor stub
		super("원숭이"); //부모클래스 생성자 호출
		System.out.println("포유류 : 원숭이");
	}
	public Mammal(String s) {
		super(s);
		System.out.println("포유류 : "+s);
	}
	
}


public class AnimalDemo {

	public static void main(String[] args) {
		
		Mammal ape = new Mammal(); //객체 생성 + 기본생성자 호출. 
		Mammal lion = new Mammal("사자"); //객체생성 + 매개변수 있는 생성자 호출
		
	}
}
