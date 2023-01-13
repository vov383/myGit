package ch15;

public class Test {

	public static void main(String[] args) {
		
		try {
			int num = Integer.parseInt("ABC");
			System.out.println(num);
			
		} catch (Exception e) {
			System.out.println("NumberFormat 예외발생 출력");
		}
		
		
		//NumberFormat 예외발생 출력
	}
}
