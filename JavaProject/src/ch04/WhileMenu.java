package ch04;

import java.util.Scanner;

public class WhileMenu {

	public static void main(String[] args) {
		int menu = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) 아메리카노");
			System.out.println("(2) 카페라떼");
			System.out.println("(3) 에스프레소");
			System.out.print("원하는 메뉴(1~3)를 선택하세요.(종료:0)> ");
			String tmp = scanner.next(); //문자입력
			menu = Integer.parseInt(tmp); //입력받은 문자를 숫자로 변환 ex) "2" => 2로
			if(menu==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(menu < 1 || menu >3) { //손님이 엉뚱한 값을 입력
				System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0) ");
				continue; //빠져나가는 것이 아니라 반복문을 지속해야 하기 때문에 continue 를 쓴다.
			
			}
			
			System.out.println("선택하신 메뉴는 " + menu + "번 입니다.");
			
		}
		scanner.close();
	}
}
