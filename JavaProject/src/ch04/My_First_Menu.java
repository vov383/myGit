package ch04;
/*과제 12-15
while문 무한루프 사용
label 활용으로 반복문 전체 종료
반복문과 if else if 로 메뉴창 만들기

*/
import java.util.Scanner;

public class My_First_Menu {
	
	public static void main(String[] args) {
		
		int menu = 0;
		Scanner scanner = new Scanner(System.in);
	
		exit_while : //Label 처리
		while(true) { //메인메뉴 무한루프
			System.out.println("==메뉴==");
			System.out.println("(1)한식");
			System.out.println("(2)양식");
			System.out.println("(3)중식");
			System.out.print("원하는 매뉴를 선택하세요.(종료:0) > ");
			
			String tmp = scanner.next();
			menu = Integer.parseInt(tmp);
			
			if(menu==1) {
				while(menu !=0) {
					System.out.println("[한식메뉴]");
					System.out.println("(1) 김치찌개");
					System.out.println("(2) 된장찌개");
					System.out.println("(3) 삽겹살");
					System.out.println("(4) 비빔밥");
					System.out.print("한식 메뉴를 선택하세요.(한식메뉴 선택 종료:0 전체 프로그램 종료:99) > ");
					String tmp2 = scanner.next();
					menu = Integer.parseInt(tmp2);
						if(menu==99) {
							System.out.println("프로그램을 모두 종료합니다.");
							break exit_while; 
						}
						else if(menu == 1) {
							System.out.println("고객님은 김치찌개를 선택하셨습니다");
						}else if(menu == 2) {
							System.out.println("고객님은 된장찌개를 선택하셨습니다");
						}else if(menu == 3) {
							System.out.println("고객님은 삼겹살을 선택하셨습니다");
						}else if(menu == 4) {
							System.out.println("고객님은 비빔밥을 선택하셨습니다");
						}else {
							continue;
						}
				}
			} else if (menu==2) {
				while(menu !=0) {
					System.out.println("[양식메뉴]");
					System.out.println("(1) 돈까스");
					System.out.println("(2) 비프스테이크");
					System.out.println("(3) 카레");
					System.out.print("양식 메뉴를 선택하세요.(중식메뉴 선택 종료:0 전체 프로그램 종료:99) > ");
					String tmp2 = scanner.next();
					menu = Integer.parseInt(tmp2);
						if(menu==99) {
							System.out.println("프로그램을 모두 종료합니다.");
							break exit_while; 
						}else if(menu == 1) {
							System.out.println("고객님은 돈까스를 선택하셨습니다");
						}else if(menu == 2) {
							System.out.println("고객님은 비프스테이크를 선택하셨습니다");
						}else if(menu == 3) {
							System.out.println("고객님은 카레를 선택하셨습니다");
						}
						else {
							continue;
						}
				}		
			
			} else if (menu==3) {
				while(menu !=0) {
					System.out.println("[중식메뉴]");
					System.out.println("(1) 짜장면");
					System.out.println("(2) 짬뻥");
					System.out.println("(3) 탕수육");
					System.out.print("중식 메뉴를 선택하세요.(중식메뉴 선택 종료:0 전체 프로그램 종료:99) > ");
					String tmp2 = scanner.next();
					menu = Integer.parseInt(tmp2);
						if(menu==99) {
							System.out.println("프로그램을 모두 종료합니다.");
							break exit_while; 
						}else if(menu == 1) {
							System.out.println("고객님은 짜장면을 선택하셨습니다");
						}else if(menu == 2) {
							System.out.println("고객님은 짬뽕을 선택하셨습니다");
						}else if(menu == 3) {
							System.out.println("고객님은 탕수육을 선택하셨습니다");
						}
						else {
							continue;
						}
				}
			}else if(menu==0){
				System.out.println("프로그램을 종료합니다.");
				break;
				
			}else {
			continue;
			}
	
		} //end outer while

	} //end main
}	
