package ch10;

public class StaticVar {
	static int a=10;
	int b=20;
	
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(StaticVar.a); //static은 클래스이름.멤버 이렇게 접근 가능. 참조변수가 아니라 클래스이름으로 바로 접근.
		
		StaticVar s=new StaticVar();
		System.out.println(s.b);
	}
}
