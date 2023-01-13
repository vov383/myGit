package ch04;
/*
계속 진행
 */
public class ContinueEx1 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			if(i%5==0) { //5의 배수라면?
				continue; //아래에 실행문 무시하고 건너뛴다. 증감식으로 바로 간다. 5의 배수가 출력 안 돼.
			} //if문 바깥
			System.out.println(i); //
		} //for문
	}
}
