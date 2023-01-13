package ch04;

public class BreakEx2 {

	public static void main(String[] args) {
		
		int i=1;
		while(i<10) { //조건식 1~9까지 반복하겠다.
			if(i==5) break; //i가 5일때 반복문 탈출
			System.out.println("i="+i);
			i++;			
		}
		System.out.println("** 반복문 종료 **");
	}
}
