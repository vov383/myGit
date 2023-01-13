package ch04;

public class BreakEx3 {

	public static void main(String[] args) {
		
		int sum=0;
		int i=0;
		while(true) {
			if(sum > 100)
				break;
			i++;
			sum+=i; // 1 3 6 10 15 21 28 35 44 54 65 77 90 104 //등차수열 만드는 방법이구나...
		}
		System.out.println("i = "+i);
		System.out.println("sum = "+sum);
	}
}
