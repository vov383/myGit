package ch04;

import java.util.Scanner;

//12-16 과제 선생님 답안인데 내가 어찌어찌 누더기로 만든거. 
//switch case 문 구조도 구조인데 속에 for문이 들어가니까 더 헷갈린다. 
//{ } 이거 열고 닫고 구조가 ㅈㄴ 헷갈려.
// switch 는 {} 생략해도 되는데 이거땜에 다른 {} 빼먹어서 ㅈㄴ 애먹엇네...


public class My_First_Menu2 {

	public static void main(String[] args) {
		int menu =0;
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		outer: //Label 처리
			while(true) {
				System.out.println("==메뉴==");
				System.out.println("(1) 한식");
				System.out.println("(2) 양식");
				System.out.println("(3) 중식");
				System.out.print("메뉴(1~3)을 선택하세요. (종료:0) > ");
				String tmp = scanner.next();
				menu = Integer.parseInt(tmp);
				if(menu==0) {
					System.out.println("전체 프로그램을 종료합니다.");
					break;
				}else if(menu<1 || menu>3) {
					System.out.println("메뉴 잘못 선택 (종료는 0) > ");
					continue;
				}
				switch (menu) {
				case 1:
					for(;;) {
						System.out.println("한식메뉴");
						System.out.println("1. 김치찌개");
						System.out.println("2. 된장찌개");
						System.out.println("3. 삼겹살");
						System.out.println("4. 비빔밥");
						System.out.print("한식메뉴를 선택하세요. (한식메뉴 선택 종료 : 0, 전체종료 : 99) > ");
						tmp = scanner.next();
						num = Integer.parseInt(tmp);
						if(num==0) {
							break;
						}
						if(num==99) {
							break outer;
						}	
						switch(num) {
						case 1: 
							System.out.println(">> 고객님은 김치찌개를 선택하셨습니다.");
							break;
						case 2: 
							System.out.println(">> 고객님은 된장찌개를 선택하셨습니다.");
							break;
						case 3: 
							System.out.println(">> 고객님은 삼겹살을 선택하셨습니다.");
							break;
						case 4: 
							System.out.println(">> 고객님은 비빔밥을 선택하셨습니다.");
							break;
						default :
							System.out.println(">>메뉴 잘못 선택 (종료는 0) > ");
						}
						continue;
					}
					continue;

				case 2:
					for(;;) {
						System.out.println("[양식메뉴]");
						System.out.println("1. 돈까스");
						System.out.println("2. 비프스테이크");
						System.out.println("3. 카레라이스");
						System.out.println("양식메뉴를 선택하세요.(한식메뉴선택종료 : 0, 전체종료 : 99) > ");				
						tmp = scanner.next();
						num = Integer.parseInt(tmp);
						if(num ==0)
							break;
						if(num ==99) break;
						switch(num) {
						case 1: 
							System.out.println(">> 고객님은 돈까스를 선택하셨습니다.");
							break;
						case 2: 
							System.out.println(">> 고객님은 비프스테이크를 선택하셨습니다.");
							break;
						case 3: 
							System.out.println(">> 고객님은 카레라이스를 선택하셨습니다.");
							break;
						}
						continue;
					}
					continue;

				case 3:
					for(;;) {
						System.out.println("[중식메뉴]");
						System.out.println("1. 짜장면");
						System.out.println("2. 짬뽕");
						System.out.println("3. 탕수육");
						System.out.println("중식메뉴를 선택하세요.(한식메뉴선택종료 : 0, 전체종료 : 99) > ");
						tmp = scanner.next();
						num = Integer.parseInt(tmp);
						if(num ==0)
							break;
						if(num ==99) break outer;
						switch(num) {
						case 1: 
							System.out.println(">> 고객님은 짜장면을 선택하셨습니다.");
							break;
						case 2: 
							System.out.println(">> 고객님은 짬뽕을 선택하셨습니다.");
							break;
						case 3: 
							System.out.println(">> 고객님은 탕수육을 선택하셨습니다.");
							break;
						}
						continue;
					}
					continue;
				} //end switch menu(;;)
			} //end while


		scanner.close();
		System.out.println("프로그램을 종료합니다.");
	}
}	
