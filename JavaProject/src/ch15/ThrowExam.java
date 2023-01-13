package ch15;

public class ThrowExam {
	//throw : 예외를 직접 발생시키는 방법. 
	static void test(int n) {
		if(n == 0) {
			throw new NullPointerException();
			//throw new 해서 예외클래스 생성자(); => 특정한 조건에 인위적 예외를 발생시킴
			//왜? test용. 그 외에는 거의 쓸 일 없다.
			//throws 와 throw 는 전혀 다른 개념. 주의하자!!
		}
	}
	
	
	public static void main(String[] args) {
		test(0);
	}
}
