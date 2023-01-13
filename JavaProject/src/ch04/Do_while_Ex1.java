package ch04;
/*
do while문
조건식 위치만 달라
실무에선 사용빈도 많지 않아. 활용도 낮다.
for 랑 while 을 많이 쓴다.
 */
public class Do_while_Ex1 {
	
	public static void main(String[] args) {
		
		int i =1;
		do { //먼저실행
			System.out.print(i);
			i++; //증감식
		} while(i<=10); //조건식(나중에 검사)	//**while문 끝에 ;붙여야 함.
		
	}

}
