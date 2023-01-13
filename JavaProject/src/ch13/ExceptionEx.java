package ch13;

public class ExceptionEx {

	public static void main(String[] args) {
		int[] nums = {10,20,30,40,50};
		try {
			for (int i = 0; i <= nums.length; i++) { //문법적으로는 오류 아님. 이클립스가 못잡아. 
//				실행되지만 에러가 난다. 이걸 Exception이라 함. 예외상황.
//				try catch로 잡자.
				System.out.println(nums[i]);
			}
		} catch (Exception e) {
			System.out.println("프로그램 실행 중 문제가 발생했습니다."); //예외 발생하면 얘가 출력함.
		}
		System.out.println("end"); //끝났다는 안내문구
		//ArrayIndexOutOfException 에러 발생 안 함.
		//try catch 용도. 
		//아주 심각한 건 아닌데 예외 상황이 발생했을 때 프로그램이 중단되는 일 없이 흘러갈 수 있게 함.
		//유용하게 많이 쓰인다. 네트워크나 이런...
		
		
	}
}
