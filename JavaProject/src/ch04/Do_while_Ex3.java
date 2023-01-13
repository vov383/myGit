package ch04;
/*
do while문 연습4
지금 말고는 연습할 일이 거의 없을걸?
연습 좀 하세요
 */
public class Do_while_Ex3 {

	public static void main(String[] args) {
		
		int i = 1;
		int num = 100;
		int sum = 0;
		do {
			sum += i;
			i++;
		}while(i<=num);
		System.out.println("1~"+num+"까지의 합계 : "+sum);
	}
}
