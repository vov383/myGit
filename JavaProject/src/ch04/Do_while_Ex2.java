package ch04;
/*
do while문 연습2
 */
public class Do_while_Ex2 {

	public static void main(String[] args) {
		int n = 1;
		do {
			System.out.println(n+"Hello World"); //일단 한번은 수행됨
			n++;
			
		} while(n<=10); //; 빼먹으면 안됨 
		System.out.println("While문 빠져나옴");	
		
	}
}
