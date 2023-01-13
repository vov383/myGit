package ch03;

public class BitNot {
	//~ ==> 비트 NOT 연산자	//비트반전, 보수
	//(비트값을 반전시켜. 0을1로, 1을 0으로, 실제 계산시에는 첫번째로 반전시키고
	//다시 한번 반전시킬 때 오른쪽 끝비트를 제외하고 반전시킨 후 합의 부호도 반전시킨다.
	//잘 쓸 일은 없는데 알고는 있어야.
	
	public static void main(String[] args) {
		
		byte a = 10; //
		System.out.println(a); //(00001010)
		System.out.println(~a); // 반전(0101) => -1011 (십진수로 -11)
		
		
		byte b = 25; //
		System.out.println(b);  // (11001)
		System.out.println(~b); // (00110)
	}
}
