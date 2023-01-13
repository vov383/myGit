package ch12;

public class InnerExam1 {

	class Cal { //인스턴스 클래스 ==> class를 OuterClass의 member 선언하는 곳에 선언한 경우 
		int value = 0;
		public void plus() {
			value++;
		}
	}
	
	public static void main(String[] args) {
		InnerExam1 t = new InnerExam1(); //외부 객체 먼저 생성
		//생성하는 방법 특이함. 기억하자
		InnerExam1.Cal cal = t.new Cal(); //내부 객체 생성하는 방법. 
		//외부클래스 타입.내부클래스명 내부참조변수명 = 외부참조변수명.new 한다.
		cal.plus();
		System.out.println(cal.value); //내부 클래스 참조변수로 접근.
	}
	
	
}
