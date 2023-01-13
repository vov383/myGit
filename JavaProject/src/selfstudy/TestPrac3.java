package selfstudy;

public class TestPrac3 {
//indexOutOfBound error 인듯?
	public static void main(String[] args) {
//배열 생성하는 방법들...
//		int arr[];
//		arr = new int[10];
//		int[] arr;
//		arr = new int[10];
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(arr.length); //길이 출력.
		
		for (int i = 0; i < arr.length; i++) { //배열 길이만큼. ==> 10번 반복.
//			arr[i]=i+1;
			System.out.println(arr[i]);
		}
	}
}
