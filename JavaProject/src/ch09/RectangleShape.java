package ch09;

public class RectangleShape extends Shape{

	private int width;
	private int height;
	
	//getter setter
	public int getWidht() {
		return width;
	}
	public void setWidht(int widht) {
		this.width = widht;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public RectangleShape(int widht, int height) {
		super("Rectangle");
		this.width = widht;
		this.height = height;
	}
	@Override
	public double calculateArea() {
		return width * (double)height;
		
	}
	@Override
	public void draw() {
		System.out.print("가로가 "+width+", 세로가 "+height+"인 사각형 ");
		super.draw();
	}
	
	
}
