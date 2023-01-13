package ch07;
//12-21 과제2
public class RadioTest {

	public static void main(String[] args) {
		Radio britz = new Radio();
		britz.setName("브리츠");
		britz.setOnOff(true);
		britz.setChannel(89.1);
		britz.setVolum(12);
		britz.print();
		
		Radio iriver = new Radio();
		iriver.setName("아이리버");
		iriver.setOnOff(false);
		iriver.setChannel(95.1);
		iriver.setVolum(9);
		iriver.print();
	}
}
