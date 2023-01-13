package ch05;

import java.util.Arrays;
import java.util.Collections;

public class SortExample {

	public static void main(String[] args) {
		int num[]  = {29, 1, 81, 70, 13, 92, 36};
		Arrays.sort(num); //오름차순 정렬. sort()메서드 사용.
		for(int i : num) {
			System.out.print(i+" "); //변수 + "(정렬자리)"
		}
		
		System.out.println();
		
		//내림차순 정렬은 Integer 라는 Wrapper class 타입으로 데이터가 처리되어야 하고
		//Collections.reversOrder() 메서드를 써서 처리하여야 한다.
		Integer rev[] = {29, 1, 81, 70, 13, 92, 36};
		Arrays.sort(rev, Collections.reverseOrder()); //내림차순. Collections 객체의 reversOrder() 메서드 사용
		
		for(int i : rev) {
			System.out.print(i+" ");
		}
		
	}
}
