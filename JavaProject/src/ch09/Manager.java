package ch09;
//12-26 과제2
public class Manager extends Employee{
	
	private int pay;
	private double bonus;
	
	public int getPay() {
		pay = salary * 12;
		return pay;
	}
	
	public double calcBonus() {
		bonus = pay * 0.3;
		return bonus;
	}
	
	public void input(int num, String name, String address, String email, int salary, String rrn) {
		setNum(num);
		this.name = name;
		this.address = address;
		this.email = email;
		this.salary = salary;
		setRrn(rrn);
	}
	
	public void print() {
		System.out.println("사번 : "+getNum());
		System.out.println("이름 : "+name);
		System.out.println("주소 : "+address);
		System.out.println("이메일 : "+email);
		System.out.println("주민번호 : "+getRrn());
		System.out.println("연봉 : "+getPay());
		System.out.println("보녀스 : "+calcBonus());
	}
}
