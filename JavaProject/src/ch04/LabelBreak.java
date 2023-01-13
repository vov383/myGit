package ch04;
//종종 쓰인다
//나중에 servlet 할 때 보게 될 것

public class LabelBreak {

	public static void main(String[] args) {
		exit_for : //래이블 처리. :(콜론)을 붙인다.
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j==3) break exit_for; //바깥쪽 for문까지 빠져나감
				System.out.println(i + "," + j);
				
			}
		}
	}

}
