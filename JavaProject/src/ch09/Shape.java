package ch09;

public class Shape {

	private String name;
	public Shape() {
		super(); //상속받은게 없는데 왜 super()?? => Object 클래스가 있음. 눈에 안보이게 extends Object 있음.
		//Object class 기본생성자 호출.
		//사실 의미는 없어.
	}
	
	public Shape(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public double calculateArea() {
		return 0.0;
	}
	public void draw() {
		System.out.println(" 도형을 그립니다.");
	}
	
}
