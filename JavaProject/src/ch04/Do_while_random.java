package ch04;
/*
랜덤 클래스 말고 Math 클래스의 랜덤메서드 활용
임의의 수 만들어서 업다운 게임
 */
import java.util.Scanner;

public class Do_while_random {

	public static void main(String[] args) {
		
		int input = 0;
		int answer = 0;
		answer = (int)(Math.random()*10)+1; //랜덤 클래스랑 비슷한 Math 클래스의 random 메서드 1~10 사이의 임의의 수를 발생 저장
		//데이터 타입 맞춰줘. 좌변 기준으로. 형변환 시켜서
		
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("1부터 10 사이의 정수를 입력하세요 : ");
			String tmp = scanner.next(); // 사용자가 문자형으로 입력
			input = Integer.parseInt(tmp); //문자형을 숫자형으로 변환 //Integer 클래스의 parseInt() 메서드
			/*나중에 웹프로그래밍 할 거야. 그때 많이 쓴다.
			계산을 하려면 서버 쪽에서 문자를 숫자로 변환해서 계산해야 해
			parseInt() 는 숫자처럼 보이는 문자열을 진짜 숫자로 바꿔주는 메서드
			*/
			
			if(input> answer) {
				System.out.println("더 작은 수로 다시 시도해보세요.");
			} else if(input < answer){
				System.out.println("더 큰 수로 다시 시도해보세요.");
			}
		}while(input != answer); //빠져나갈 조건
		scanner.close();
		System.out.println("정답입니다.");
	}
}
