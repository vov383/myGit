package ch09;

public class Volume extends Area{

	//멤버변수
	private int height;
	
	
	public Volume() {};
	
	public Volume(int width, int length, int height) {
		super(width, length); //부모생성자 호출, 매개변수 2개짜리.
		this.height = height;
		
	}
	
	public int getVolume() {
		return getArea()*height;
	}
}
