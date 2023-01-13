package ch08;

public class PersonUse {

	public static void main(String[] args) {
		
		Person p1 = new Person(); //객체생성 + 기본생성자 호출
		p1.showInfo(); 
		//호출 했더니 this("홍길동", 170, 60) 때문에 매개변수 3개짜리로 들어가서 값이 인스턴스의 맴버변수로 들어감.	
		//그리고 showInfo() 호출. 멤버변수 값이 더해져서 출력됨.
		
		Person p2 = new Person("추신수");
		p2.showInfo(); //
		
		Person p3 = new Person("류현진", 191); //매개변수 2개. 
		p3.showInfo();
		
		Person p4 = new Person("이정후", 185, 88); //매개변수 3개.
		p4.showInfo();
	}
}
