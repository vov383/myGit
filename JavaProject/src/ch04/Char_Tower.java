package ch04;
/*
아스키값으로 증가시키는건 알겠는데 왜 A가 출력됐을까
내 생각에는 B부터 나와야할 거 같은데 멀 잘못생각하고 있지???
아 print(a)하고 후항연산으로 a+1 하라는 뜻이구나
 */
public class Char_Tower {

	public static void main(String[] args) {
		
		int i, j;
		char a=65; //65는 Ascii 로 대문자 'A'
		for(i=1; i<5; i++) {
			for(j=1; j<=i; j++) {
				System.out.print(a++); //a에서 1씩 증가시켜 66 67 68....
			}
			System.out.println(); //줄바꿈
		}
	}
}
