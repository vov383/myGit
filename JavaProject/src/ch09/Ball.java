package ch09;

public class Ball extends Circle{

	private String color;
	public Ball(String color) {
		this.color = color;
	}
	public Ball() { //기본생성자는 안 만들어도 상관없는데 만드는 습관이 좋음. 
		
	}
	public void findColor() {
		System.out.println(color + " 공이다.");
	}
	public void findVolume() {
		System.out.println("부피 구하기");
	}
}
