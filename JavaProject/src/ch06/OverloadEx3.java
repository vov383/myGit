package ch06;

public class OverloadEx3 {
/*
 * 12-22 과제
 */
	public static void main(String[] args) {
		print("김과장", 560);
//		print("홍길동","hong@gmail.com","010-1234-5678");
//		print("홍길동", 100, 90, 72);
	}
	static void print(String name, int salary) {
		System.out.println("==============================");
		System.out.println("이름\t급여\t세금\t실수령액");
		System.out.println(name+"\t"+salary+"\t"+(double)(salary*0.3)+"\t"+(double)(salary-(salary*0.3)));
	}

	static void print(String name, String email, String hp) {
		System.out.println("====================");
		System.out.println("이름\t이메일\t\t\t전화");
		System.out.println(name+"\t"+email+"\t\t"+hp);
	}
	
	static void print(String name, int kor, int eng, int mat) {
		System.out.println("====================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"
		+(kor+eng+mat)+"\t"+String.format("%.1f", (double)(kor+eng+mat)/3));
		
	}

	
}
