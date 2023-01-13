package ch10;
//12-28 과제2
class Pa3 {
	int num = 10; //사번
	String name = "홍길동";
	public void print() {
		System.out.println("사번 : "+num);
		System.out.println("이름 : "+name);
	}
}

class Ch3 extends Pa3 {
	String email = "hong@gmail.com";
	String hp="010-1234-5678";
	String addr="서울 강남구 역삼동";
	@Override
	public void print() {
		super.print();
		System.out.println("이메일 : "+ email);
		System.out.println("전화 : "+hp);
		System.out.println("주소 : "+addr);
	}
}

public class Poly3 {
	
	public static void main(String[] args) {
		Pa3 p = new Ch3(); //다형성
		p.print();
	}
}
