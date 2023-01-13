package ch10;

class A2 {
	final void print() { //method에 final이 붙으면 상속관계에 있어서 method Overriding이 안됨.
		System.out.println("a");
	}
}

class B2 extends A2 {

//	@Override
//	void print() {
//		System.out.println("b");
//	}
	
}

public class FinalMethod {

	public static void main(String[] args) {
		
		B2 b = new B2(); //subClass 생성하면 superClass 자동생성.
		b.print(); //Override 안됐으니까 A2의 print()호출 ==> "a"출력됨.
	}
}
