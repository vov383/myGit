package ch04;
/*
whlie문으로 구구단 출력 프로그램 만들기
Scanner 활용
출력하고자 하는 단을 입력하면 해당 단이 출력되도록

출력결과 
3 x 1 = 3
3 x 2 = 6
...
 */
import java.util.Scanner;

public class While_Gugu {

	public static void main(String[] args) {
		int dan;
		int n = 1;
		//스캐너
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단 중에서 출력하고 싶은 단을 입력하세요 : ");
		dan = sc.nextInt();
		
		while(2<=dan && dan <=9) {
			while(n<=9) {
				System.out.println(dan+" X "+n+" = "+dan*n);
				n++;
			} //inner while
			n=1; //n을 1로 초기화
			System.out.print("구구단 중에서 출력하고 싶은 단을 입력하세요 : "); //다시 입력받게
			dan = sc.nextInt();
		} //outer while	
		sc.close();
	} //main
}
