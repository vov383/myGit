package ch04;
/*
do while문 언제 활용해?
	정확한 값을 입력받고자 할 때
 */
import java.util.Scanner;

public class Do_while_Ex4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int month;
		do { //정확한 값을 입력받고자 할 때사용
			System.out.println("올바른 월을 입력하세요 [1-12] : ");
			month = input.nextInt();
		}while(month < 1 || month > 12); // while문 빠져나가기. 
		input.close();
		System.out.println("사용자가 입력한 월은 " + month);
	}
	
}
