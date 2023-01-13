package ch12;

public class TestOuter {

	private int data = 30;
	
	class Inner{ //내부 클래스
		void msg() {
			System.out.println("data is "+data); 
			//내부 클래스의 장점. 다른 클래스인데 외부 클래스의 private member에 바로 접근.
		}
	}
	
	
	
	public static void main(String[] args) {
		
		TestOuter obj = new TestOuter();
		TestOuter.Inner in = obj.new Inner(); //내부 객체 생성
		in.msg();
	}
}
