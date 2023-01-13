package ch10;

public class StaticMethod {

	static int a=10;
	int b=20;
	
	public static void printA() {
		System.out.println(a);
		StaticMethod s = new StaticMethod(); //static member에서 non-static member접근하려면 생성 하여야.
		System.out.println(s.b); 
	}
	
	public void printB() { //non-static method
		System.out.println(a);
		System.out.println(b); //non-static method는 non-static 자유롭게 갖다 쓸 수 있음.
	}
	
	public static void main(String[] args) {
		printA();
//		printB(); //non-static 쓰려면 생성 하여야.
		StaticMethod s2 = new StaticMethod();
		s2.printB(); //참조변수.methodName
	}
}
