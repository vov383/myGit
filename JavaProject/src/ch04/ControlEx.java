package ch04;
//뭐때문에 tmp가 지역변수로 안 쓰이고 중복되는 오류가 났나 했더니
//for(;;) 무한루프문 구현부 { }이게 안 들어가서 생긴 오류였다. 그거땜에 ㅈㄴ 어려웠네...
//지역변수 때문에 에러나면 중괄호 빼먹은 곳을 찾아보자.
import java.util.Scanner;

public class ControlEx {
	public static void main(String[] args) {
		int menu = 0; //초기화를 해주는 것이 좋다. 그냥 선언하고 입력 받아도 되는데 초기화 해주는 것이 좋음
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		outer: //Label처리
		while(true) {
			System.out.println("(1) square(제곱)");
			System.out.println("(2) square root(제곱근)");
			System.out.println("(3) log(로그)");
			System.out.print("원하는 메뉴(1~3)를 선택하세요.(종료:0 > ");
			String tmp = scanner.next();
			menu = Integer.parseInt(tmp);
			if(menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(menu < 1 || menu > 3) {
				System.out.println("메뉴를 잘못 선택하셨습니다. (종료는 0)");
				continue;
			} //end if-else
			
			//for문은 무한루프 어케 넣을까?
			for(;;) {//이렇게. 근데 보기 좀 그래서 보통 while(true)를 많이 쓴다.
				System.out.print("계산할 값을 입력하세요.(계산종료 : 0, 전체종료 : 99) > ");
				tmp = scanner.next();
				num = Integer.parseInt(tmp);
				if(num==0) {
					break;
				}
				if(num==99) {
					break outer; //전체종료. 바깥 for문까지 한번에 빠져나가.
				}	
					//정수값으로 조건을 줄 때는 
					//switch case
					
				switch (menu) {
				case 1:
					System.out.println("result=" + num*num);
					break;
				case 2:
					System.out.println("result=" + Math.sqrt(num)); //제곱근 메서드
					break;
				case 3:
					System.out.println("result=" + Math.log(num)); //로그 메서드
					break;
				} //end switch case
				
			}//end for
		
		} //end while.
		System.out.println("프로그램을 모두 종료합니다.");
			
	} //end main
}
