package ch13;

public class Append {
	
	public static void main(String[] args) {
		
		String a = "hello";
		System.out.println(a);
		System.out.println(System.identityHashCode(a));
		
		a = a+"java"; //내용 바뀐 것? x -> 새로운 주소로 바뀐 것.
		System.out.println(a);
		System.out.println(System.identityHashCode(a)); //주소값 달라진 것 확인. //기존 a는 메모리에 붕 떠있음.
		
		StringBuilder b = new StringBuilder("hello"); //StringBuffer는 옛날 꺼. Bulider가 개량버전. 요즘꺼.
		System.out.println(System.identityHashCode(b)); //
		b.append("java"); //내용을 바꿨는데
		System.out.println(b);
		System.out.println(System.identityHashCode(b)); //주소값 유지.
		
		
	}
}
