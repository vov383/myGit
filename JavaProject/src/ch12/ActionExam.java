package ch12;

	
abstract class Action{ //추상 클래스
	public abstract void exec(); //추상메서드
}

public class ActionExam extends Action{
	
	@Override
	public void exec() {
		System.out.println("I am Child");
	}
	
	public static void main(String[] args) {
		//{}틀은 있는데 이름이 없어. 그래서 익명 내부 클래스. 
		Action a = new ActionExam() { //; 안나오고 중괄호를 써서
			private String name = "kim";
			
			@Override
			//메서드 오버라이드 가능.
			public void exec() {
				System.out.println("나는 "+name+"이다.");
			}
			
		}; //여기에 ;찍는다. ;이 클래스임을 알 수 있는 단서.
		//단서 ==> 익명 내부 클래스 블럭 끝에는 ;이 반드시 있다.
		//이벤트 처리 등 1회성으로 사용하는 간단흔 코드에 익명클래스 자주 사용.
		//무명내부클래스는 이름이 없기 때문에 외부클래스$번호.class로 컴파일됨. 
		//(확인 : C:\work_java\JavaProject\bin\ch12) ActionExam$1.class
		
		a.exec(); //OutClass의 참조변수로 호출 InnerClass의 메서드를 호출. 
	} //end main()
}
