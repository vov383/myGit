package ch13;

public class Change {

	public static void main(String[] args) {
		int a = 10;//콜라 컵
		int b = 20;//사이다 컵
		int temp;//b의 값을 a로 넣기 전에 임시로 a를 백업할 공간. 임시변수로 활용
		
		temp = a;
		a=b;
		b=temp;
		//이런 알고리즘이 sorting에 들어가 있다.
		System.out.println(a);
		System.out.println(b);
	}
}
