package ch05;

public class ForeachEx {
	enum Week {월, 화, 수, 목, 금, 토, 일}
	//enum type. 배열의 일종. 간편하게 쓸 수 있다.
	//단지 데이터를 나열해서 쓰기만 하면 된다.
	//보통은 세미콜론 쓰는데 얘는 세미콜론 쓰면 안 돼!!
	//흔하게 쓰는 종류는 아니다.
	
	public static void main(String[] args) {
		
		int[] n = {1,2,3,4,5};
		String names[] = {"사과","배","바나나","체리","딸기","포도"};
		int sum = 0;
		
		for(int k : n) {
			System.out.print(k+" ");
			sum += k;
		}
		System.out.println("합은 : "+sum);
		
		for(String s : names) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//객체타입에서 활용하는 거 맛보기.
		for(Week day : Week.values()) { //집합변수처리. 객체.values() 값을 가져오는 메서드.
			System.out.println(day+"요일");
		}
	}
}
