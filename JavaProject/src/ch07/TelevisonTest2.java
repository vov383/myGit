package ch07;

public class TelevisonTest2 {

	public static void main(String[] args) {
		Televison myTv = new Televison(); //객체 생성 = > 메모리에 로딩
		System.out.println(myTv); //주소값 출력됨. ==> hashCode라고 함. 
		myTv.channel =7;
		myTv.volum = 10;
		myTv.onOff = true;
		System.out.println("나의 텔레비전이ㅡ 채널은 "+myTv.channel+"이고 볼륨은 "+myTv.volum+"입니다.");
	
	
		Televison yourTv = new Televison(); //참조변수 이름은 달라야함. 다른 이름으로 생성해야.
		System.out.println(yourTv); //메모리상의 다른 주소에 또 하나 만들었다.
		yourTv.channel = 9;
		yourTv.volum = 12;
		yourTv.onOff = true;
		System.out.println("너의 텔레비전의 채널은 "+yourTv.channel+"이고 볼륨은 "+yourTv.volum+"입니다.");
				
	}
}
