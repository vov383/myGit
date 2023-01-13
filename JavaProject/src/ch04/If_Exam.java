package ch04;
//조건문
//짝수 ==> a%2==0 이면 a는 짝수
public class If_Exam {
	public static void main(String[] args) {
		
		int a = 5;
		if ( a%2 == 0 ) { //a를 2로 나눈 나머지가 0이면 조건문 실행
			System.out.println( a + "는 짝수 입니다.");
		}
		System.out.println("if문이 끝난 이후 그 다음 명령문을 실행합니다.");
		
	}

}
