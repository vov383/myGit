package ch08;
//생성자와 메서드 오버로딩. 활용.
public class Person {
	//멤버변수
	private String name;
	private int height;
	private int weight;
	
	
	//생성자의 주 역할은 setter 역할이다.
	public Person() { //기본생성자
		this("홍길동", 170, 60); //다른 생성자 호출 (String, int, int)형태의 다른 생성자 호출.
	}
	public Person(String name) { //매개변수 하나짜리
		this(name, 190, 100); //다른 생성자 호출. 3개 짜리 찾아가. 데이터 타입도 맞춰줘.
	}
	public Person(String name, int height) { //매 2
		this(name, height, 70); //다른 생성자 호출. 3개짜리를 찾아가.
	}
	public Person(String name, int height, int weight) { //매 3
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public void showInfo() { //프린트용 
		System.out.println("===신상 정보===");
		System.out.println("이름 : "+ name);
		System.out.println("신장 : "+ height);
		System.out.println("체중 : "+ weight);
	}
}
