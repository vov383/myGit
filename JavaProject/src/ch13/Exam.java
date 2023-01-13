package ch13;

public class Exam {

	public static void main(String[] args) {
		
		String a = "hello"; //대문자로 시작. 객체. 그런데 new없이 데이터 올릴 수. string pool 영역에 올라감.
		System.out.println(System.identityHashCode(a));
		String b = "hello";
		System.out.println(System.identityHashCode(b)); //주소값이 같게  나옴.
		//String pool의 특징. 변수가 달라도 같은 내용이면 같은 메모리에 잡힌다.
		System.out.println(a==b); //주소값이 같아? true
		
		String c = new String("hello"); //정상적인 객체생성 기법. 매개변수 받아서 데이터 올라가. heap 메모리에. 
		System.out.println(System.identityHashCode(c)); //
		
		String d = new String("hello"); // 
		System.out.println(System.identityHashCode(d)); //주소값이 다르게 나옴.
		System.out.println(c==d); //주소값 같아? false
		System.out.println(c.equals(d)); //내용 같아? true
		//equals()를 사용해서 내용 같은지 확인.
		
		
	}
}
