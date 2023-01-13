package ch07;

public class TelevisonTest {

	public static void main(String[] args) {
		
		Televison tv = new Televison(); //객체 생성.
		//Televison이라는 원본 소스를 메모리에 올림.. 인스턴스화
		System.out.println(tv); //메모리 주소값 출력.
		tv.channel =7;
		tv.volum =9;
		tv.onOff = true;
		System.out.println("텔레비전의 채널은"+tv.channel+"이고 볼륨은"+tv.volum+"입니다.");
	}
}
