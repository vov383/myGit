package selfstudy;

//비트연산!! i번째 자리수가 1인지 0인지
public class BitTest {
	//i만큼 << 한 값과 num을 &연산 
	static boolean getBit(int num, int i) {
		return (num & (1 << i)) !=0;
	}
	//i 번째 비트를 1로 만들고 싶어.
	static int setBit(int num, int i) {
		return num | (1 << i );
		
	}
	//i 번째 비트를 0으로 만들고 싶어
	static int clearBit(int num, int i) {
		return num & ~(1 << i);
	}
	//i 번째 비트 포함 그 왼쪽을 전부 0으로 만들고 싶어
	static int clearLeftBits(int num, int i) {
		return num & ((1 << i) -1); 
	}
	//i 번 비트 포함 그 오른쪽을 전부 0으로 만들고 싶어.
	static int clearRightBits(int num, int i) {
		return num & (-1 << (i+1));
	}
	//i 번 비트 값을 0으로 만들고 나머지는 원래값 해놓고 i 번 비트값을 원하는 값으로 세팅
	static int updateBit(int num, int i, boolean val) {
		return (num & ~(1 << i)) | ((val? 1: 0) << i);
	}
	
	public static void main(String[] args) {
	//9==>(1001)
		System.out.println(getBit(9,3));
	//5==>(0101)
		System.out.println(getBit(5, 3));

	//5==>(0101)	
		System.out.println(setBit(5,3)); // ==> (1101) == 13
	
	// (1001)
		System.out.println(clearBit(9, 3));
		
	// 169 ==> (10101001)
		System.out.println(clearLeftBits(169, 3));
				//(10101001)
		System.out.println(clearRightBits(169, 3)); //==> (10100000) == 160
	
				//(10101001)
		System.out.println(updateBit(169, 3, false)); //==> (10100001) == 161
	}
	

}
