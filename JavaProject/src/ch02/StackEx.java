package ch02;

public class StackEx {

	public static void main(String[] args) {

		int a = 5; a = 4; a=3; a=2; a=1; // 지역변수 여러번 초기화.
		System.out.println(a);	//a = 1. stack 후입선출. 마지막에 들어간 애가 먼저 나와. 책을 쌓듯이.
	}

}
