package ch06;
//리턴 있는 메서드
public class ReturnEx {
	
	public static int sum(int a) { //리턴 타입 int
		int result=0; //int 타입으로 미리 초기화.
		for (int i = 1; i <= a; i++) {
			result = result + i;
		}
		return result; //메서드를 호출한 곳으로 값을 반환.
	}
	
	public static void main(String[] args) {
		int n = sum(50);
		System.out.println(n); //50번 돌려서 누적된 값 1275 출력.
		n=sum(100); //메서드 재사용.
		System.out.println(n); //100번 돌려서 누적된 값 5050 출력.
	}
}
