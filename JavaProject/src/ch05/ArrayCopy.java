package ch05;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		int list[] = {10,20,30,40,50};
		System.out.println(list);
		//배열 복사 방법 2가지.
		//1)얕은복사 : 배열의 주소값 공유해서 복사
		//참조변수는 뭘 참조해? 메모리의 주소값
		int[] numbers = list; //우변의 값을 좌변에 집어넣어서 주소값 복사.
		System.out.println(numbers); //주소값을 println 해보면 똑같다.
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		
		//2)깊은 복사 : 따로 새 배열을 만들어. 데이터 자체를 복사.
		int[] list_copy = Arrays.copyOf(list, list.length); 
		//Arrays 객체가 제공하는 copyOf() 메서드. 참조변수1은 어떤 배열에서 데이터 가져올지, 참조변수2는 길이값
		System.out.println(list_copy); //주소값은 다르다.
		for(int value:list_copy) {
			System.out.println(value);
		}
	}
}
