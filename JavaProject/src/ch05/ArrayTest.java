package ch05;
//파일 이름이 잘못되면 마우스 클릭하고 F2 누르면 Rename 할 수 있다.
//배열은 변수 하나로 여러 자료를 처리한다.

public class ArrayTest {
	public static void main(String[] args) {
		int[] s = new int[10]; //배열 10칸 크기 지정
		for(int i=0; i<s.length; i++) { //i는 index의 i다. 자주 쓰는거
			s[i] = i; //s[0]=0. 배열인덱스값이랑 값이 같아진다.
			System.out.print(s[i]+ " ");

		}
	}
}
