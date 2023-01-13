package ch13;

public class StrEx {
	
	public static void main(String[] args) {
		
		String str = "Java Programming";
		System.out.println(str);
		
		//대문자로 변경
		System.out.println(str.toUpperCase());
		//소문자로
		System.out.println(str.toLowerCase());
		//실제 str의 원문이 바뀐 것X. ==> String의 불변성. immutable (원본은 바뀌지 않음).
		System.out.println(str);
		
		str = str.toLowerCase(); //우변의 값을 좌변으로 초기화 ==> 주소값을 바꿔버리면 바뀜
		//기존 str은 끊어지고 소문자 문자열로 새로 연결. 기존 것은 메모리상에서 떠돌아다님. 나중에 가비지컬렉터가 버려줌.
		System.out.println(str);
		
		str = ""; //null 문자열. 초기화. 실질적인 값 있음('\0' 가리킴).
		System.out.println("내용 : "+str);
		str = null;//주소값을 지워버림. 참조 내용이 없어.
		System.out.println("내용 : "+str); //내용이 null이 나옴.
		
		char ch = '\0';//null 문자. 
		System.out.println("내용 : "+ch+" , code : "+(int)ch);//왜 ㅁ모양이 출력될까? 빈칸 보여주는건가?
		
		ch = ' ';//null이랑 달라.
		System.out.println("내용 : "+ch+" , code : "+(int)ch);//32가 나옴. 문자 ' '(space)의 코드값이 32다.
		
	}
}
