package ch07;

public class Televison {
	//클래스 바로 밑에 쓰는 변수는 멤버변수다.
	int channel; //멤버변수, 전역변수. 초기화를 꼭 안해도 됨. 자동으로 int channel = 0; 초기화됨. //지역변수는 꼭 초기화 해야됨.
	int volum;
	boolean onOff; //전원상태. boolean은 기본적으로 false 초기화됨. onOff = false;
	
	//멤버 메서드.
	void print() {
		System.out.println("채널은 "+ channel +"이고 볼륨은 "+ volum +"입니다.");
	}
	
	int getChannel() {
		return channel;
	}
	
	void setChannel(int ch) {
		channel = ch;
	}
}
