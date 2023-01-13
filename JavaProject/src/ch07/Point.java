package ch07;

public class Point { //학점계산 객체지향 버전

	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avg;
	private String grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTot() {
		tot = kor+eng+mat;
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		avg = tot/3.0;
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public String getGrade() {
		if(avg >= 90) {
			grade="수";
		}else if(avg >= 80) {
			grade="우";
		}else if(avg >= 70) {
			grade="미";
		}else if(avg >= 60) {
			grade="양";
		}else {
			grade="가";
		}
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public void print() {
	System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등급");
	System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+getTot()
			+"\t"+String.format("%.1f", getAvg())+"\t"+getGrade());
	}
	
	
}
