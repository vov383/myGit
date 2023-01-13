package ch07;

public class PersonUse {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("김철수");
		p1.setAge(20);
		p1.setHeight(180.0);
		p1.print();
		
		Person p2 = new Person();
		p2.setName("홍길동");
		p2.setAge(30);
		p2.setEmail("hong@naver.com");
		p2.setAddress("서울 강남구 역삼동");
		p2.print();
		
		Person p3 = new Person();
		p3.setName("사임당");
		p3.setAge(25);
		p3.setEmail("saimdang@gamail.com");
		p3.setAddress("서울 강남구 개포동");
		p3.print();
		
		
//		p1.name = "김철수";
//		p1.age = 20;
//		p1.height = 180.0;
//		System.out.println("이름 : "+p1.name);
//		System.out.println("나이 : "+p1.age);
//		System.out.println("키 : "+p1.height);
	}
}
