package ch04;
/*
 * 2중 for문
 * println() 출력을 어디에 넣느냐에 따라 결과값이 달라진다.
 */
public class GuguDan2 {
	public static void main(String[] args) {
		for(int dan = 2; dan <=9; dan++) {
			System.out.println("** " + dan + " 단 **"); //타이틀
			for(int n=1; n<=9; n++) {
				System.out.println(dan+" x "+n+" = "+dan*n);
			}//inner for
		}//outer for
	} //end
}
