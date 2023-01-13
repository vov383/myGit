package ch10;

public class StaticVar2Use {

	public static void main(String[] args) {
		System.out.println(StaticVar2.total);
		StaticVar2 car1 = new StaticVar2("쏘나타"); //인스턴스 생성 멤버변수 1개.
		StaticVar2 car2 = new StaticVar2("모닝"); //
		StaticVar2 car3= new StaticVar2("아반떼"); //메모리 주소는 따로따로
		System.out.println(car1.model);
		System.out.println(car2.model);
		System.out.println(car3.model);
		System.out.println(StaticVar2.total); //인스턴스 생성될 때마다 total++ //static은 공용 메모리 공간.
		
	}
}
