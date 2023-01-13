package ch07;

public class TelevisionTest3 {

	public static void main(String[] args) {
		Televison myTv = new Televison();
		myTv.channel = 7;
		myTv.volum = 9;
		myTv.onOff = true;
		myTv.print();
		
		
		Televison yourTv = new Televison(); //객체 생성. 메모리 주소가 다른 곳에 있다.
		yourTv.channel = 9;
		yourTv.volum = 12;
		yourTv.onOff = true;
		yourTv.print();
		
		
		
	}
}
