package ch11;

public class OuterClass {

	private static int x = 10;
	class Inner {
		int getX() {
			return x; //private인데 얼마든지 접근 가능.
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(x); //그냥 x에 접근해서 찍은 것.
		
		OuterClass e = new OuterClass();
		OuterClass.Inner in = e.new Inner(); //Inner 인스턴스 생성
		System.out.println(in.getX()); //Inner class에 접근해서 찍은 것.
		
	}
}
