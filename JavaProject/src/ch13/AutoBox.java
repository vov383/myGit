package ch13;

public class AutoBox {

	public static void main(String[] args) {
		//기본 자료형
		int num1 = 10;
		int num2;
		
		//객체 자료형
		Integer i1; //i1은 객체참조변수. 주소값 저장함. 선언만 했으니까 i1의 값은 null 상태
		Integer i2 = new Integer(20); //auto boxing (기본자료형을 객체로 boxing)
		i1 = num1; //에러 안남
		num2 = i2; //에러 안남. Integer를 int에 넣을 수. 
//					why? => auto Unboxing. 
//						객체 안에 들어있는 값을 풀어서 기본 타입으로 바꾸었기 때문에 저장 가능.
		
		System.out.println(num1+","+i1);
		System.out.println(num2+","+i2);
		
	}
}
