package ch04;
/*
whlie문으로 구구단 만들기
inner while 끝에 n을 1로 초기화 안 시켜서 처음에 실패했음.

 */
public class While_GuguDan {

	public static void main(String[] args) {
		int dan = 2;
		int n = 1;
		while(dan <=9){
			while(n<=9) {
				System.out.println(dan+" X "+n+" = "+dan*n);
				n++;
			} //inner while
			n = 1; // n을 1로 초기화 시켜주어야. 안 그러면 2단 연산 이후에 while문이 안 돌아감.
			dan++;
			System.out.println();
		} //outer while
	} //main
}
