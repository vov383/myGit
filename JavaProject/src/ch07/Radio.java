package ch07;
//12-21 과제2
public class Radio {
	
	private String name;
	private boolean onOff;
	private double channel;
	private int volum;
	
	
	public void print() {
		System.out.println("["+name+" 라디오]");
		if(onOff==true)
			System.out.println("라디오가 켜져있습니다.");
		else
			System.out.println("라디오가 꺼져있습니다.");
		System.out.println("현재 채널은 : "+channel+"입니다.");
		System.out.println("볼륨은 : "+volum+"입니다.");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public boolean isOnOff() {
		return onOff;
	}
	public void setOnOff(boolean onOff) {
		this.onOff = onOff;
	}
	public double getChannel() {
		return channel;
	}
	public void setChannel(double channel) {
		this.channel = channel;
	}
	public int getVolum() {
		return volum;
	}
	public void setVolum(int volum) {
		this.volum = volum;
	}
	
}
