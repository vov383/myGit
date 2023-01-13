package ch04;
//12-15 과제3
//2중 for문
//outer for문에서 print 하는지
//inner for문에서 print 하는지에 따라서 결과값 달라짐
public class Gugudan3 {
	public static void main(String[] args) {
		for(int dan = 2; dan < 10; dan++) {
			for(int n =1; n<10; n++) {
				System.out.print(dan+"x"+n+"="+dan*n+"\t");
			}
			System.out.println();
		}
	}
}
