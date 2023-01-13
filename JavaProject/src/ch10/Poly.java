package ch10;

class K { //superClass
	int a = 10;
	public void print() {
		System.out.println(a);
	}
}

class V extends K { //subClass
	int a = 20;
	@Override
	public void print() {
		System.out.println(a);
	}
}


public class Poly {

	public static void main(String[] args) {
		
		//non-static은 생성해야.
		V a = new V();
		a.print(); //자식쪽 print()호출
		K b = new K();
		b.print(); //부모쪽 print()호출
		
		//다형성으로 처리
		K c = new V(); //부모 타입으로 자식 객체 생성.
		c.print();
		//다형성 쓸 때 실제 참조변수가 가리키는 객체가 사용하고자 하는 객체가 맞는지 검사할 때.
		//instanceof 연산자 사용.
		System.out.println("c instanceof V ? : " + ( c instanceof V )); //true 출력됨. // K를 써도 true 출력됨.
		
	}
}
