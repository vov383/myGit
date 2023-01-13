package ch11;

public class AbstractExtends extends AbstractClass{

	@Override
	void method1() {
		System.out.println("추상 method를 완성한 method");
	}
	
	public static void main(String[] args) {
		
		//AbstractClass a = new AbstractClass(); //추상클래스는 객체생성 안됨.
		AbstractExtends ex = new AbstractExtends();
		ex.method1();
		ex.method2();
		
	}
}
