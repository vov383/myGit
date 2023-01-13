package ch13;

public class StringExam {

	public static void main(String[] args) {
		
		String str1 = new String("Hello World"); //정석 : new 해서 생성자 매개변수 처리
		String str2 = new String("Hello World"); 
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2)); //new 썼으니 메모리 주소값 달라
		
		System.out.println("====(==사용)====");
		if(str1 == str2) { //주소값 비교
			System.out.println("str1과 str2는 같은 인스턴스를 참조합니다.");
		}else {
			System.out.println("str1 str2는 다른 인스턴스를 참조함");
		}
		
		System.out.println("====(equals()사용)====");
		if(str1.equals(str2)) { //내용(값) 비교
			System.out.println("str1과 str2는 같은 내용임.");
		}else {
			System.out.println("str1 str2는 다른 내용임");
		}
		
	}
}
