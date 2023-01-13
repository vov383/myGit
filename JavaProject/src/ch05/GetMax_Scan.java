package ch05;

import java.util.Scanner;

public class GetMax_Scan {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int intArray[] = new int[5]; //배열 생성 20byte
		int max=0;
		System.out.println("양수 5개를 입력하세요.");
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = scanner.nextInt();
			if(intArray[i] > max) { //max 초기값과 들어온 값을 비교하고 더 큰 값을 max에 넣는다.
				max = intArray[i];
			}
		}
		System.out.println("가장 큰 수는 "+max + "입니다.");
		scanner.close();
	}
}
