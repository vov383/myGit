package ch11;

public class Circle extends Shape{

	@Override
	public void draw() {
		System.out.println("원 그리기 중심 x 좌표갑 ; "+ x);
		System.out.println("원 그리기 중심 y 좌표갑 ; "+ y);
	}

}
