package ch08;
//12-23 과제2
public class Auction {

	private String name;
	private String userId;
	private int money;
	private String grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public String getGrade() { 
		if(money >= 100000) { //등급계산
			grade = "gold";
		}else {
			grade = "silver";
		}
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public void print() {
		System.out.println("이름\t아이디\t구매금액\t등급");
		System.out.println(name+"\t"+userId+"\t"+money+"\t"+getGrade());
	}
}
