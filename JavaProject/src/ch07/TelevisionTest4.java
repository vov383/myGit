package ch07;

public class TelevisionTest4 {
	
	public static void main(String[] args) {
		Televison myTv = new Televison(); //객체 생성. 메모리에 올라감.
		myTv.channel = 7; //Television의 멤버변수에 기억을 시켜뒀으니까 => 변수 ch에 7이 들어간다.
		myTv.volum = 9;
		myTv.onOff = true;
		int ch = myTv.getChannel(); //getChannel 메서드 호출.
		System.out.println("현재 채널은 "+ch+"입니다.");
	}
}
