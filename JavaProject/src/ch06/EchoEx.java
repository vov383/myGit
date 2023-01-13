package ch06;

public class EchoEx {

	public static void main(String[] args) {
		echo("안녕!", 3);
	}

	public static void echo(String s, int n) { //s="안녕!", n=3
		for (int i = 0; i < n; i++) { //3번 실행
			System.out.println(s);
		}
	}
}
