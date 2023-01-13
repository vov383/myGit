package test02;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 1 이상 입력하세요.");
//		int num = sc.nextInt();
		int num = 1;
		
		int sum = 0;
		
		if(num > 0) {
			int i = 1;
			while(i <= num) {
				sum += i;
//				i++;
			}
			System.out.println("1부터 "+num+"까지의 합은 "+sum);
		}else {
			System.out.println("숫자 1이상이 아님");
		}
		
	}
}
