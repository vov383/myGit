package ch12;

public class InnerExam2 {

	static class Cal{ //내부 static class
		int value = 0;
		public void plus() {
			value++;
		}
	}
	
	public static void main(String[] args) {
		
		//내부 static 클래스 접근시
		//외부클래스.내부클래스 참조변수 = new 외부클래스.내부생성자
		//pdf에도 적혀있다.
		InnerExam2.Cal cal = new InnerExam2.Cal(); //내부 static 클래스 생성
		cal.plus();
		System.out.println(cal.value);
	}
	
}
