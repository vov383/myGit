package ch11;

public class B implements A { //implements 키워드로 구현!

	@Override
	public void input() {
		System.out.println("데이터 입력");
	}

	@Override
	public void print() {
		System.out.println("데이터 출력");
	} 
	
	
}
