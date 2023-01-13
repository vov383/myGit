package ch09;

public class Scholar extends Student { //Scholar is a Student ==> is a relation
	// can use superClass's member
	private String category; //장학금 종류
	private int money; //장학금 금액
	
	public void input(String name, String num, String major, int year
			, String category, int money) {
		super.input(name, num, major, year); //부모쪽. input 메서드 호출
		this.category = category;
		this.money = money;
		//super() => 부모 클래스의 생성자 호출.
		//super. => 부모 클래스의 변수, 메서드 호출.
		//this() => 현재 클래스의 다른 생성자 호출.
		//this. => 현재 클래스의 변수, 메서드 호출.
	}
	public void print() {
		System.out.println("이름\t학번\t전공\t학년\t구분\t장학금액");
		System.out.println(getName()+"\t"+getNum()+"\t"+getMajor()+"\t"+getYear()+"\t"+category+"\t"+money);
		
	}
	public void print2() {
		System.out.println("이름\t학번\t전공\t학년");
		System.out.println(getName()+"\t"+getNum()+"\t"+getMajor()+"\t"+getYear());

	}

	
}	