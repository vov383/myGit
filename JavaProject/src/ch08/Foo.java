package ch08;

public class Foo {
	int a;
	double b;
	
	public Foo() {
		this(1); //똑같은 이름의 오버로드 된 다른 생성자 호출. 매개변수를 보내준다.
		int c=1;
	}
	public Foo(int x) { //x=1
		a=x;
		b=20.0;
	}
	
	
	
}
