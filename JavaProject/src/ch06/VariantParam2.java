package ch06;
//가변형 매개변수는 매개변수 개수가 상관없어.
//매개변수 데이터 타입만 맞추면 오버로드.
public class VariantParam2 {

	public static void main(String[] args) {
		System.out.println("=== 상반기 과목 ===");
		print("java", "DB");
		print(99,88);
		System.out.println();
		System.out.println("=== 하반기 과목 ===");
		print("HTML","JSP","Spring");
		print(95, 86, 75);
		System.out.println();
	}
	
	static void print(String ... n) {
		for (int i = 0; i < n.length; i++) {
			System.out.println("과목 : " +n[i]);
		}
		System.out.println("-------------");
	}

	static void print(int ... n) {
		int tot=0;
		for (int i = 0; i < n.length; i++) {
			System.out.println("점수 : "+n[i]);
			tot += n[i];
		}
		System.out.println("총점 : "+tot);
		System.out.println("평균 : "+String.format("%.1f", (double)tot/n.length));
	}




}
