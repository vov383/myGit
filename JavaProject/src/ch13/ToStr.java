package ch13;

public class ToStr {

	public static void main(String[] args) {
		
		Object obj = new Object(); //Object 객체 생성
		obj = new Integer(20); //참조변수에는 원래 메모리 주소값이 들어감. 
		
		//Auto Boxing 처리됨. 객체안에 값을 집어넣어.
		//jdk 1.5ver 부터 value가 들어갈 수 있도록 내부처리. (intValue())하도록 했다.
		System.out.println(obj); //결과 : 20
		//Auto Unboxing 객체에서 값을 꺼냄. 값으로 출력하기 위해서.
		
		//다형성
		obj = new Double(20.5);
		System.out.println(obj);
		
		obj = new String("hello");
		System.out.println(obj); //오토박싱 언박싱 : primitive type이 객체에 들어갔다 나왔다.
		
		obj = "hello"; //String pool 메모리에 올려
		System.out.println(obj);
	}
}
