package ch12;

public class InnerExam3 {
	
	public void exec() {
		class Cal{ //지역 내부클래스. 메서드 안에 class 선언
			int value = 0;
			public void plus() {
				value++;
			}
		} //end class
		Cal cal = new Cal();
		cal.plus();
		System.out.println(cal.value);
	} //end method
	
	
	
	public static void main(String[] args) {
		
		InnerExam3 t = new InnerExam3(); //외부 클래스 선언하고
		t.exec(); //메서드를 호출만 해서 지역 내부 클래스 사용
		
	}
}
