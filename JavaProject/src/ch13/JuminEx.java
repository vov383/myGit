package ch13;

import java.util.Calendar;
import java.util.Scanner;

public class JuminEx {
	public static void main(String[] args) {
		String jumin=""; String gender=""; String season="";
		
		Calendar cal = Calendar.getInstance();
		Scanner scan = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요 (-를 포함하여 입력) : ");
		jumin = scan.next();
		scan.close();
		
		int age = Integer.parseInt(jumin.substring(0, 2));//맨앞 두자리로 나이 계산
		char s = jumin.charAt(7);//뒷자리 맨앞으로 성별 계산
		//성별 1(1900년대), 3(2000년대) = 남자, 2(1900년대), 4(2000년대) = 여자
		if(s=='1' || s=='3') {
			gender="남";
		}else if(s=='2' || s=='4') {
			gender="여";
		}else {
			gender="외국인";
		}
		
		//나이 구하기
		if(s=='1' || s=='3') {
			age = (cal.get(Calendar.YEAR)-(1900+age)+1); //2023-1993+1 => 31 
		}else if(s=='2' || s=='4') {
			age = (cal.get(Calendar.YEAR)-(2000+age)+1);
		}
	
		//계절 구하기
		String w = jumin.substring(2, 4);
		switch(w) {
		case "12": case "01": case"02": season="겨울"; break;
		case "03": case "04": case"05": season="봄"; break;
		case "06": case "07": case"08": season="여름"; break;
		case "09": case "10": case"11": season="가을"; break;
		}
		
		System.out.println("주민등록번호 : "+jumin);
		System.out.println("성별 : "+gender);
		System.out.println("나이 : "+age);
		System.out.println("태어난 계절 : "+season);
	
	}
	
	
	
	
}
