package test02;

public class WhileTrueSum {

	public static void main(String[] args) {
		int i=1;
		int sum = 0;
		while(true) {
			if(i>10) break;
			sum+=i;
			i++;
		}
		System.out.println(sum);
	}
}
