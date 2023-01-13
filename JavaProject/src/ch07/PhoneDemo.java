package ch07;

//한 개의 파일에 2개 이상의 class 코드 작성할 때 주의사항**
//main() 있는 public class를 클래스이름으로 저장하여야.
//다른 파일은 무조건 default 접근제어자 사용.
//실무에선 이렇게 하면 안돼.
class Phone{
	String model;
	int value;
	void print() {
		System.out.println(value +"만원 짜리 "+model+"스마트폰");
	}
}

public class PhoneDemo { //실행파일

	public static void main(String[] args) {
		Phone myPhone = new Phone(); //객체 생성
		myPhone.model = "갤럭시 S11";
		myPhone.value = 100;
		myPhone.print();
		
		Phone yourPhone = new Phone(); //객체 생성. 메모리 주소가 달라. 따로따로 처리됨.
		yourPhone.model = "iPhone13";
		yourPhone.value = 150;
		yourPhone.print();
	}
}
