package ch15;

public class TryEx {

	public static void main(String[] args) {
		
		int[] num = {10,20,30,40,50};
		try {
			for (int i = 0; i < num.length; i++) {//=를 넣어서 에러 일부러 발생시켜
				System.out.println(num[i]); //Error java.lang.ArrayIndexOutOfBoundsException: 5
				//문법적으로 문제없기 때문에 실행 전에 이클립스가 미리 못 잡는다.
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
