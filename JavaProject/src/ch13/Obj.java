package ch13;

//public class Obj extends Object{ //우리가 만드는 클래스는 이게 생략되어 있음.
public class Obj {
	
	public static void main(String[] args) {
		Obj e1 = new Obj(); //객체생성.
		//참조변수. 하면 Object의 method()를 볼 수 있다.
		System.out.println(e1.getClass()); //클래스 정보
		System.out.println(e1); //주소값
		System.out.println(e1.toString()); //주소값을 문자열화 시켜줌. 
	}

}
