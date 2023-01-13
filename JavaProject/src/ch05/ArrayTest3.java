package ch05;

public class ArrayTest3 {
	
	public static void main(String[] args) {
		
		int[] numbers = {10,20,30};
		for(int i=0; i<numbers.length;i++) {
			System.out.println(numbers[i]);
		} //배열 전체 출력. 
		
		System.out.println();
		//for~each문(향상된 for문) //객체 다룰 때 유용하게 쓰인다.
		for(int aa : numbers) {
			System.out.println(aa)
			;
		}
		
		
	}
}
