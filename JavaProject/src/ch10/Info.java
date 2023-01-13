package ch10;

public class Info {

	public static void main(String[] args) {
		
		System.out.println("회사명 : "+Constants.COMPANY_NAME); //static으로 선언했으니까 클래스명.상수 해서 접근 가능.
		System.out.println("전화번호 : "+Constants.TEL);
		System.out.println("주소 : "+Constants.ADDRESS);
	}
	//웹페이지로 보자. 
	//페이지 파일을 여러개 만들었어. //상수처리 안했으면 뭐 주소 바뀌었을 때 페이지마다 다 바꿔야함.
	//상수처리 했으면 상수 하나만 바꾸면 나머지 파일은 자동으로 바뀐다.
	//회사정보가 Info 파일로 여러군데 사용된다면 상수처리했을 때 편리하다.
}
