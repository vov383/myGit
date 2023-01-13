package ch04;
//sysout prinln() 위치에 따라 출력이 달라짐
//for문 안에 있냐 밖에 있냐에 따라
public class For_Ex4 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			System.out.println(i);
			System.out.println();
			
		}
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
		System.out.println();
	}
}
