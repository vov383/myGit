package ch09;
//12-26 과제2
public class Employee {
	private int num; //사번
	public String name; //이름
	String address; //주소
	String email; //이메일
	protected int salary; //월급 250;
	private String rrn; //주민번호
	
	//getter setter
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getRrn() {
		return rrn;
	}
	public void setRrn(String rrn) {
		this.rrn = rrn;
	}
	
	
	
	
}
