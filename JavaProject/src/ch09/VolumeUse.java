package ch09;

public class VolumeUse {

	public static void main(String[] args) {
		Volume vol = new Volume();
		System.out.println("부피 : "+vol.getVolume()); //결과 : 0 why? => 기본생성자 찾아갔더니 값 없어. 
		//값들이 0으로 초기화되어 있음. 0*0*0 = 0; 
		Volume vol2 = new Volume(10, 20, 30); //매개변수 3개짜리 Volume() 호출.   
		System.out.println("부피 : "+vol2.getVolume());
	}
}
