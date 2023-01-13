package ch10;

public class StaticVar2 {

	static int total; //0
	String model;
	public StaticVar2(String mode1) {//생성자
		this.model=mode1;
		total++; //1->2->3. static은 메모리 하나 따로 잡힘. 나머지 인스턴스가 공유함.
	}
}
