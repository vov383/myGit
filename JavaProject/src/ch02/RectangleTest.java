package ch02;

import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("직사각형의 가로 길이를 입력하세요 : ");
		int x = in.nextInt();
		System.out.print("직사각형의 세로 길이를 입력하세요 : ");
		int y = in.nextInt();
		in.close();
		
		double area = x * y;
		System.out.println("직사각형의 넓이는 " + area+ " 입니다.");
		
	}

}
