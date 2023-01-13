package ch09;

public class TriangleShape extends Shape{
	private int width;
	private int height;
	
	//getter setter
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	//constructor
	public TriangleShape(int width, int height) {
		super("Triangle");
		this.width = width;
		this.height = height;
	}
	@Override
	public double calculateArea() {
		return width * height * 0.5;
	}
	@Override
	public void draw() {
		System.out.print("높이가 "+ height + "밑변이 "+width+"인 삼각형 ");
		super.draw();
	}
	
	
	
	
}
