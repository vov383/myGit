package ch04;

public class If_Else_ex1 {
// if else문. 실행문 2개.

	public static void main(String[] args) {
		
		int score = 50;
		String result = "";
		if( score >= 60) {	//true
			result ="합격";
		} else {			//false
			result ="불합격"; 
		}
		System.out.println(result);
	}
}
