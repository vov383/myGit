package ch15;

public class NegartiveArrayEx {

	public static void main(String[] args) {
		try {
			int arr[] = new int[3];
			arr[3]=20;//Array index는 0부터 n-1까지. 3은 길이값
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());//메세지를 가져오는 개발자 코드
			e.printStackTrace();
		}
		
		try {
			int arr[] = new int[-10];
			
		} catch (NegativeArraySizeException e) {//배열의 크기를 음수로 지정하면 발생하는 익셉션
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
