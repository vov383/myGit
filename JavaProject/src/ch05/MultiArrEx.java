package ch05;

import java.util.Scanner;
//영어 단어 암기 프로그램
public class MultiArrEx {

	public static void main(String[] args) {
		//3row(행) 2column(열)
		String words[][] = {{"chair", "의자"} //words[0][0], words[0][1]
		, {"computer","컴퓨터"} //words[1][0], words[1][1]
		, {"integer","정수"}}; //words[2][0], words[2][1]
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<words.length; i++) {
			System.out.printf("문제%d) %s의 뜻은?", i+1, words[i][0]);
			String tmp = scanner.next();
			if(tmp.equals(words[i][1])) {
				System.out.printf("정답입니다.%n%n");
			}else {
				System.out.printf("오답입니다. 정답은 %s입니다. %n%n", words[i][1]); //printf 는 format 잘 맞춰야해
			}
		}
	scanner.close();	
	}
}
