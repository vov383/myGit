package ch04;
/*
이거 왜 이렇게 되는지 잘 생각해봐야함
아직 한번에 안 떠오름. 감이 덜잡힌듯.
 */
public class Star3 {

	public static void main(String[] args) {
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<3-i; j++) {
				System.out.print(" ");
			} //inner for1
			for(int j=0; j<2*i+1; j++) {
				System.out.print("*");
			} //inner for2
			System.out.println("");
		}
		
	}
}
