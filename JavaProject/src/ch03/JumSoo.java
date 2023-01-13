package ch03;

import java.util.Scanner;

public class JumSoo {

	public static void main(String[] args) {

		String name;
		int java;
		int db;
		int html;
		int jsp;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		name = scan.next();
		System.out.print("Java 점수를 입력하세요 : ");
		java = scan.nextInt();
		System.out.print("DB 점수를 입력하세요 : ");
		db = scan.nextInt();
		System.out.print("HTML 점수를 입력하세요 : ");
		html = scan.nextInt();
		System.out.print("JSP 점수를 입력하세요 : ");
		jsp = scan.nextInt();
		
		scan.close();
		
		//계산
		int tot = java + db + html + jsp;
		double avg = tot/4.0;
		
		//출력
		System.out.println("=====================================================");
		System.out.println("이름\tJava\tDB\tHTML\tJSP\t총점\t평균");
		System.out.println("-----------------------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%.1f\n", name, java, db, html, jsp, tot, avg);
		System.out.println("=====================================================");		
		
	}

}
