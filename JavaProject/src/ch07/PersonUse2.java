package ch07;
//12-21 과제3
public class PersonUse2 {
	public static void main(String[] args) {
		
		Person p2 = new Person();
		p2.setName("홍길동");
		p2.setAge(30);
		p2.setEmail("hong@naver.com");
		p2.setAddress("서울 강남구 역삼동");
		p2.print2();
		
		Person p3 = new Person();
		p3.setName("사임당");
		p3.setAge(25);
		p3.setEmail("saimdang@gamail.com");
		p3.setAddress("서울 강남구 개포동");
		p3.print2();

	}
}	
