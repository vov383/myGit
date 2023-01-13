package ch09;
//12-26 과제2
public class ManagerTest {
	public static void main(String[] args) {
		Manager mng = new Manager();
		mng.input(1, "홍길동", "서울 강남구 역삼동", "hong@gmail.com", 250, "123456-1234567");
		mng.print();
	}
}
