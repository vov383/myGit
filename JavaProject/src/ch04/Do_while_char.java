package ch04;
/*
do while 연습3
char 자료형으로
 */
public class Do_while_char {
	public static void main(String[] args) {
		
		char c = 'a';
		do {
			System.out.print(c);
			c=(char)(c+1); //영문의 경우 1을 더하면 다음 문자의 코드 값
		}while(c <= 'z');
		
		
	}	


}
	
