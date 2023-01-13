package ch10;
/*
 * static => 메모리에 바로 로딩.
 * non-static => 객체 생성 후 메모리에 로딩. new 하여야.
 * static method에서는 static 안의 로컬변수나 sattic으로 정의되는 멤버변수만 사용가능. 그 외에는 객체생성하고 참조변수로 접근.
 */

public class A {

	String name = "kim"; //멤버변수 non-static 멤버. 
	static int n = 20; //스테틱 멤버.
	public void print() {
		System.out.println(name);
		System.out.println(n);
	}
	
	public static void main(String[] args) { //static 멤버.
		int a = 10;
		double b = 20.5;
		System.out.println(a);
		System.out.println(b);
		
//		System.out.println(name); //에러? non-static 멤버를 쓰려면 객체를 생성하여야.
		A aa = new A();
		System.out.println(aa.name); //non-static 멤버를 사용하려면 참조변수. 해서 접근하여야.
		
		System.out.println(n); //static 끼리는 통해. 그냥 쓸 수 있어.
		
		aa.print();
	}
}
