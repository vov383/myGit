package ch10;

public class OverloadEx {

	public void putData(String a) {
		System.out.println(a);
	}
	public void putData(int a) { //데이터타입이 틀리거나 매개변수 갯수가 다르면 오버로드
		System.out.println(a);
	}
	public void putData(double a) {
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		OverloadEx o = new OverloadEx(); //non-static 멤버는 참조변수명.멤버. //객체생성하면 멤거가 heap 메모리에 올라감.
		o.putData("Hello");
		o.putData(10);
		o.putData(10.5);
	}
}
