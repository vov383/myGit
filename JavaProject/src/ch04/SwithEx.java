package ch04;
/*
 * switch case()문
 * (key)의 value가 일치하는 case의 구현부를 실행
 * (key)는 int type
 * 반드시 case 실행문 다음엔 break;
 * break없으면 계속 다음 코드로 진행함
 * 어느 case에도 해당하지 않으면 default 출력 
 * 
*/
public class SwithEx {

	public static void main(String[] args) {
		int n = 2;
		switch (n) { //조건식
		case 1:
			System.out.println("1");
			break;
		case 2: //값 일치하는 부분만 실행하고 싶어
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		default:
			System.out.println("4이상");
		}
	}
}
