package ch13;

import java.util.Arrays;
import java.util.Collections;

public class SortEx {

	public static void main(String[] args) {
		
		Integer arr[] = {3,29,46,15,89,-20};
		System.out.println("배열 데이터 :");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		System.out.println("오름차순 정렬 : ");
		Arrays.sort(arr);//Arrays 객체에서 지원해주는 sort() 자동 오름차순 정렬 해줌
		for(int i : arr) {
			System.out.print(i+"\t");
		}
		System.out.println();
		
		//내림차순 정렬
		System.out.println("내림차순 정렬 : ");
		Arrays.sort(arr, Collections.reverseOrder());//Collections 객체의 reversOrder() 사용
		for(int i : arr) {
			System.out.print(i+"\t");
		}
		
		//sorting()에 Change.java 에서 사용한 메커니즘이 구현됨.
		
	}
}
