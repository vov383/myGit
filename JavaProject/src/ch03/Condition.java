package ch03;

public class Condition {
	//조건연산자 삼항연산자 와 if문
	public static void main(String[] args) {
		int num = -5;
		System.out.println( num> 0 ? num : -num ); //f 니까 반전부호
		
		 
		if(num>0) { //조건이 t면
			System.out.println(num);
		} else { //조건이 f면
			System.out.println(-num);
		}
	}
}
