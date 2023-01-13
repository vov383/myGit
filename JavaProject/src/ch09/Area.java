package ch09;

public class Area {
	//멤버변수
	private int width; //width =0; 자동 초기화. 멤버변수니까.
	private int length;
	
	//생성자
	public Area() {	} //한줄로 해도 되고
	public Area(int width, int length) {
		this.width = width;
		this.length = length;
	}
	
	//메서드
	public int getArea() {
		return width*length;
	}
	
	

}
