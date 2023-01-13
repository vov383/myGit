package ch05;
/*
 * 무명배열 : 배열 이름x, 단순히 초기값만으로 배열 활용.
 * 이름이 없으니까 이름 재활용 가능. 
 * 무명클래스 무명 어쩌고~~~~
 * 목적 : 초기값 쓰는 목적. 딱 한번만 데이터가 필요할 때
 * 다시는 그걸 참조할 일이 없는 경우 사용. 1회성 데이터 
 */
public class AnonymousArray {
	public static void main(String[] args) {
		//출력문에 바로 //sum()메서드 활용. 매개변수에 바로 배열을 생성해. 
		System.out.println("숫자들의 합 : "+sum(new int[] {1,2,3,4} ));
	}

	//빨간줄에 마우스 대면 이클립스가 저절로 만들어줌
	//호출했다가 요리해주고 리턴해주고
	//리턴을 안할 수도 있고
	//메서드는 매개변수가 들어올 수도 있고 안들어올 수도 있고
	private static int sum(int[] numbers) {
		// TODO Auto-generated method stub
		int total = 0;
		for(int i=0; i<numbers.length; i++) {
			total += numbers[i];
		}
		return total;
	}
}
