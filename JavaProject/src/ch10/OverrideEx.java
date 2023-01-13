package ch10;

class Test11 {
	public void print() {
		System.out.println("test11");
	}
}

class Test22 extends Test11 {
	@Override
	public void print() { //Overriding. Header는 같지만 Body는 재정의해서 쓴다.
		System.out.println("test22");
	}
}

public class OverrideEx {

	public static void main(String[] args) { 
		//non-static에 접근하려면 생성하여야.
		Test22 t = new Test22();
		t.print();
	}
}
