package ch07;

public class TelevisionTest5 {

	public static void main(String[] args) {
		
	Televison myTv = new Televison();
	myTv.setChannel(11); //Television에 있는 channel 값을 11로 세팅.
	int ch = myTv.getChannel(); //Television에 있는 ch값 11을 get()메서드로 호출
	System.out.println("현재 채널은 "+ch+"입니다.");
	}
}
