package ch06;
/*
 * 12-21 과제
 * static 으로 배열 선언. 전역변수, 멤버변수
 * main() 에는 메서드 호출만 남겨
 * getTot() getAvg() print() 만들어서 성적표 출력.
 */
public class StudentPoint {
	static int studentId = 1001;
	static String[] name = {"홍길동","사임당","이순신"};
	static int[] java = {90, 95, 84};
	static int[] db = {85, 79, 92};
	static int[] html = {99, 88, 95};
	static int[] jsp = {76, 92, 72};
	static int[] tot = {0,0,0};
	static double[] avg = {0,0,0};

	public static void main(String[] args) {
		getTot();
		getAvg();
		print();
	}

	private static void print() {
		System.out.println("---------------------------------------------------------------");
		System.out.println("학번\t이름\tJava\tDB\tHTML\tJSP\t총점\t평균");
		System.out.println("---------------------------------------------------------------");
		for (int i = 0; i < name.length; i++) {
			System.out.println(i+studentId+"\t"+name[i]+"\t"+java[i]+"\t"+db[i]+"\t"+html[i]+"\t"+jsp[i]
					+"\t"+tot[i]+"\t"+String.format("%.1f", avg[i]));
		}
		System.out.println("---------------------------------------------------------------");
	}

	private static void getAvg() {
		for (int i = 0; i < name.length; i++) {
			avg[i] = (double)(tot[i]/4);
		}
	}

	private static void getTot() {
		for (int i = 0; i < name.length; i++) {
			tot[i] = java[i]+db[i]+html[i]+jsp[i];
		}
	}
}
