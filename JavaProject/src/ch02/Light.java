package ch02;

public class Light {

	public static void main(String[] args) {
		// long 은 8byte; bit로는 64bit. 정수를 저장.
		long lightspeed;
		long distance;
		
		lightspeed = 300000L; // L생략 가능.
		distance = lightspeed * 365L *24 * 60 * 60;
		// 빛의 속도 * 365일 * 24시간 * 60분 * 60초.
		System.out.println("빛이 1년동안 가는 거리 : " + distance + " km");
	}	// "문자열" + 변수 = : 여기서 + 기호는 연결 연산자.

}
