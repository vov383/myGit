package ch15;

import java.util.InputMismatchException;
import java.util.Scanner;

//Error가 두개 이상
public class DoubleExam {
	public static void main(String[] args) {
		int num = 50;
		Scanner scan = null;
	
		try {
			System.out.println("숫자를 입력하세요 :");
			scan = new Scanner(System.in);
			int value = scan.nextInt();
			System.out.println(num/value);
		} catch (NullPointerException e) {//세부 익셉션을 먼저 처리
			System.out.println("널포인트 예외");

		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없어요");
		} catch (InputMismatchException e) {
			System.out.println("정수만 입력할 수 있어요");
		} catch (Exception e) {//모든 익셉션을 처리하기때문에 Exception은 항상 마지막에 
			System.out.println("기타예외");
		} finally {//예외 발생 여부와 관계없이 항상 실행되도록(필수코드 아님)
			if(scan !=null) {
				scan.close();//if문으로 감싸주는것이 좋다?
			}
		}
		System.out.println("end");
	}	
}
