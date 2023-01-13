package ch10;

class Pa {
	String name="홍길동";
	public void print() {
		System.out.println("이름 : "+name);
	}
}

class Ch extends Pa {
	int age = 30;
	@Override
	public void print() {
		super.print(); //superClass의 print() 호출
		System.out.println("나이 : "+age);
	}
}

public class Poly2 {
	
	public static void main(String[] args) {
		String tel = "010-1234-5678";
		
		//다형성 ==> 좌:부 우:자
		Pa c = new Ch();
		c.print(); //자식 print() 호출
		System.out.println("전화번호 : "+tel);
	}
	
}
