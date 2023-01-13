package ch10;

public class Test {

	static int a; //static member
	int b; //non-static member
	void print() { //non-static member
		System.out.println(a); //non-static member에서 static member 쓰는 건 무리 없어. //a는 이미 메모리에 올라와 있기 때문.
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		System.out.println(a);
		
//		System.out.println(b); //non-static member 객체 생성 안해서 못써.
		Test t = new Test();
		System.out.println(t.b); //new 해야만 non-static인 b를 쓸 수 있다.
		t=null; //객체의 주소값을 지워버림.
		System.out.println(t.b); //널 포인트 익셉션java.lang.NullPointerException
		
		System.out.println(Math.PI); //대표적인 static member
	}
}
