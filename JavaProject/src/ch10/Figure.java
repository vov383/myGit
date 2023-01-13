package ch10;

class Triangle extends Figure {

	@Override
	void draw() {
		System.out.println("삼각형 그리기...");
	}
}

class Rectangle extends Figure {

	@Override
	void draw() {
		System.out.println("사각형 그리기...");
	}
}

class Circle extends Figure {
	@Override
	void draw() {
		System.out.println("원 그리기....");
	}
}

public class Figure {
	void draw() {
		System.out.println("도형을 그립니다.");
	}
	
	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.draw();
		Rectangle r = new Rectangle();
		r.draw();
		Circle c = new Circle();
		c.draw();
		
		//이제 다형성을 써보자.
		Figure f = new Triangle(); //superClass를 좌변에 subClass를 우변에. => 다형성 기법.
		f.draw();
		f = new Rectangle();
		f.draw();
		f = new Circle();
		f.draw();
		//같은 참조변수로 객체의 메서드에 접근. 이게 다형성. 
		//코드상으로 좌변은 부모객체, 우변은 자식 객체. 앞으로 다형성 기법 많이 쓸 거다.
	}
}
