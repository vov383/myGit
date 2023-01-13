package ch04;
/*
무한반복에서 break; 로 탈출하기
 */
public class BreakEx1 {

	public static void main(String[] args) {
		
		int i = 1;
		while(true) { //무한반복
			System.out.println(i++);
			if(i>10) break; //반복문 종료	//한줄이라 { }생략.
			
		}	
		System.out.println("프로그램 종료");
	}

}
