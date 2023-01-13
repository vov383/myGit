package ch07;

public class BoxTest {

	public static void main(String[] args) {
		
		Box b; //객체선언. 형 데이터 타입. 참조변수; 내가 만든 데이터 타입.
		b = new Box(); //한번 선언했는데 또 선언하면 에러남.
		b.width = 20;
		b.length = 20;
		b.height = 30;
		
		System.out.println("상자의 가로, 세로, 높이는 "+b.width+", "+b.length+", "+b.width+" 입니다.");
	}
}
