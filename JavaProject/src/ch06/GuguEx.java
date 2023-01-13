package ch06;

public class GuguEx {

	static void gugu(int dan) { //gugu() 는 dan을 입력받으면 구구단 출력
		System.out.println("==="+dan+"단"+"===");
		for (int i = 1; i <=9; i++) {
			System.out.println(dan+" X "+i+" = "+dan*i);
		}
	}
	static void guguAll() { //guguAll() 은 2단부터 9단까지 전부 출력.
		for (int i = 2; i <= 9; i++) {
			System.out.println(("==="+i+"단"+"==="));
			for (int j = 1; j <= 9; j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
		}
	}
	public static void main(String[] args) {
		gugu(3);
		guguAll();
	}
}