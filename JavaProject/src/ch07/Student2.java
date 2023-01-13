package ch07;
//getter setter 없이 일반 메서드로 처리
public class Student2 {
	//멤버변수
	private String name; 
	private String major; //전공
	private int year; //학년
	private String num; //학번
	private double point; //평점 평균
	private int money; //등록금
	private int save; //장학금

	//매개변수를 활용하면 된다.
	public void input(String name, String major, int year, String num, double point, int money) {
		this.name = name; //지역변수와 멤버변수 이름이 같을 때 this 로 명시해야 한다.
		this.major = major;
		this.year = year;
		this.num = num;
		this.point = point;
		this.money = money;
	}
	
	public void calc() {
		if(point >= 4.3) {
			save = money;
		}else if(point >= 4.0) {
			save = 250;
		}else if(point >=3.5) {
			save =100;
		}
	}
	
	public void print() {
		System.out.println("이름\t전공\t학년\t학번\t\t평점평균\t등록금\t장학금");
		System.out.println(name+"\t"+major+"\t"+year+"\t"+num+"\t"+point+"\t"+money+"\t"+save);
	}
}
