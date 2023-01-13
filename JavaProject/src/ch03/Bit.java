package ch03;

public class Bit {
//비트연산자 OR AND XOR
	public static void main(String[] args) {
													// 끝자리부터 하면 편함
		//비트 OR
		System.out.println( 3 | 5 ); // (0011 | 0101) => 0111 ==> 7
		//비트 AND
		System.out.println( 3 & 5 ); // (0011 & 0101) => 0001 ==> 1
		//비트 XOR(상호베타)
		System.out.println( 3 ^ 5 ); // (0011 ^ 0101) => 0110 ==> 6
	}
}
