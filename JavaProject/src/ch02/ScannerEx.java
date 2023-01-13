package ch02;

import java.util.Scanner;	// [HotKey]Ctrl + Shift + 0

public class ScannerEx {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// 키보드로부터 사용자 입력값을 처리해주는 Scanner
		System.out.println("첫번째 정수값을 입력하세요 : ");
		int x = in.nextInt(); // 정수값 입력받게 하는 메서드.
		System.out.println("두번째 정수값을 입력하세요 : ");
		int y = in.nextInt();
		System.out.printf("%d * %d은 %d입니다.\n", x, y, x*y);	
		in.close();// 스캐너 종료.
	
	
	}

}
