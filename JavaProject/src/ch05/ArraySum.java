package ch05;

public class ArraySum {

	public static void main(String[] args) {
		
		int[] num = {10, 20, 30, 40, 50};
		int sum=0; //배열 합계를 저장할 변수
		
		for(int i=0; i<num.length; i++) { //length를 쓰면 배열 데이터에 변화가 있더라도 바로 대응 가능.
			sum += num[i];
		}
		
		System.out.println("합계 : "+sum);
		
	}
}
