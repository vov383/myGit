package ch03;
//Casting 형변환
//묵시적 명시적
//명시적은 개발자가 직접 & 값손실o

public class CastEx {
	public static void main(String[] args) {
		
		//Casting 형변환
		float f = 1.6f; //4byte
		System.out.println(f);
		
		//묵시적 형변환 //자동 //정수 100을 float형 실수 100.0F로 변환 
		f = 100;
		System.out.println(f);
		
		//명시적 형변환 //개발자가 직접 개입 //값 손실 우려
		f = 100.5F;
		int i = (int)f; //4byte로 같지만 float형이 크다고 봄.
		System.out.println(i); //0.5 사라짐
	}

}
