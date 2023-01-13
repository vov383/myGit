package ch06;

public class ReturnEx2 {

	public static void main(String[] args) {
		printScore(120);
	}
	public static void printScore(int score) {
		if(score <= 0 || score >= 100) {
			System.out.println("잘못된 점수 : "+ score);
			return; //메서드 종료 return이 맨 끝에만 와야하는 것 아님. 
			//때에 따라서 중간에 넣어서 종료시켜도 됨.
		}
		System.out.println("점수 : " + score);
	}
}