package ch03;

public class TerrayOperator {
//삼항연산자	
	public static void main(String[] args) {
		
		int x = 1;
		int y;
		y = (x==1)? 10:20;
		System.out.println(y);
	
		y = (x>1)? y++ : x+20;
		System.out.println(y); //조건이 f라서
	}
}
