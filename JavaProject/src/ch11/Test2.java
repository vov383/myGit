package ch11;

public class Test2 extends Test {

	//상속하자마자 에러. => Add unimplemented method 해주면 됨.
	@Override
	public void print() { //구현부만 있으면 된다.
		System.out.println("추상 클래스 구현");
	} 
	
	public static void main(String[] args) {
		
//		Test a = new Test(); //추상클래스는 생성불가. 
		Test2 t = new Test2(); //반드시 자식을 통해서 생성하여야.
			
		
		
		Test b = new Test2(); //다형성으로는 되네...
		t.print();
		b.print();
		
	}
	
}
