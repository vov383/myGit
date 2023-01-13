package ch06;

public class PointEx {
	//멤버변수
	static String[] name = {"홍길동", "이몽룡", "이순신", "차두리", "박지성"};
	static int[] kor = {80,90,100,60,70};
	static int[] eng = {90,99,77,66,88};
	static int[] mat = {80,60,80,90,100};
	static int[] tot = {0,0,0,0,0};
	static double[] avg = {0,0,0,0,0};
	
	public static void main(String[] args) {
		//매인메서드는 가급적 메서드 호출만 하는 것이 깔끔.
		getTot();
		getAvg();
		print();
	}
	static void getTot() {
		for (int i = 0; i < name.length; i++) {
			tot[i] = kor[i]+eng[i]+mat[i];
		}
	}
	static void getAvg() {
		for (int i = 0; i < name.length; i++) {
			avg[i] = (double)tot[i]/3.0;
		}
	}
	static void print() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+tot[i]
		+"\t"+String.format("%.1f", avg[i])); 
		}
	}
}
