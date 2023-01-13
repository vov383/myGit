package ch03;

public class CalEx2 {
	//printf() 형식지정자 // \n ==> 개행 //printf()안에 %를 표시할 때 %% 써야함.
	public static void main(String[] args) {
		int a = 20;
		int b = 8;
		System.out.printf("a+b=%d\n", a+b);
		System.out.printf("a-b=%d\n", a-b);
		System.out.printf("a*b=%d\n", a*b);
		System.out.printf("a/b=%d\n", a/b);
		/*
		System.out.printf("a%b=%d\n", a%b);//%를 하나만 쓰면 이상해짐.//Format specifier '%d'at java.util.Formatter.format(Unknown Source)
		*/
		System.out.printf("a%%b=%d\n", a%b);//%% 로 써야함.
	}
}
