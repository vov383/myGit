package ch04;
//(신민재) (남의 코드 보기)
/*
 * 내가 모르는 hashMap 사용
 * 배열 적극 활용해서 
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class My_First_Menu3 {

	public static void main(String[] args) {

		outer:

		for (;;) {

			Map<String, Object> menuName = new HashMap<String, Object>();
			String[] subMenuName = new String[] { "1. 김치찌개", "2. 된장찌개", "3. 삼겹살", "4. 비빔밥" };
			menuName.put("1", subMenuName);
			subMenuName = new String[] { "1. 돈까스", "2. 비프 스테이크", "3. 카레라이스" };
			menuName.put("2", subMenuName);
			subMenuName = new String[] { "1. 짜장면", "2. 짬뽕", "3. 탕수육" };
			menuName.put("3", subMenuName);

			System.out.println("(1) 한식");
			System.out.println("(2) 양식");
			System.out.println("(3) 중식");
			System.out.print("원하는 메뉴 (1~3)을 선택하세요. (종료 : 0)");

			Scanner scan = new Scanner(System.in);
			String tmp = scan.next();
			int menu = Integer.parseInt(tmp);
			subMenuName = (String[]) menuName.get(tmp);

			if (menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;

			} else if (menu < 1 || menu > 3) {
				System.out.println("메뉴를 잘못 선택하셨습니다. (종료 : 0)");
				continue;
			}

			for (;;) {

				for (int i = 0; i < subMenuName.length; i++) {
					System.out.println(subMenuName[i]);
				}

				System.out.print("메뉴를 선택하세요 : ");
				System.out.print("메뉴를 선택하세요.(메뉴선택종료:0, 전체종료:99)>");
				Scanner subScan = new Scanner(System.in);

				tmp = subScan.next();
				int num = Integer.parseInt(tmp);

				if (num == 0) break;
				else if (num == 99) break outer; // 전체종료
				else if (num > subMenuName.length ) {
					System.out.println("◆◆◆ 메뉴에 없는 번호입니다. ◆◆◆");
					continue;
				}

				System.out.println("▶ 고객님이 선택한 메뉴는" + subMenuName[num - 1].substring(2) + "입니다. ◀");
			}

		}

		System.out.println("프로그램을 모두 종료합니다.");
	} // main
}