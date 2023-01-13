package ch04;
/*
 * for문 안에 if else문
 * a += b 가 for문 안에 있을 때 누적되는 것 직접 확인해보기
 */
public class For_If_Else {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i<=10; i++) { //10번 반복
			sum += i; //sum = sum+i	// 1=0+1, 3=1+2, 6=3+3, 10=6+4, 15=10+5, 
									//21=15+6, 28=21+7, 36=28+8, 45=36+9,  55=45+10 ==> 끝
			System.out.print(i);
			if(i<=9) { //i가 1~9 까지는 "+" 출력
				System.out.print("+");
			}else { //딱 하나 남은 i가 10인 경우 "="과 sum 출력
				System.out.print("=");
				System.out.print(sum);
			}
		}
	}
}
