package ch05;
//비정방형 배열

public class SkewedArray {

	public static void main(String[] args) {
		//비정방형 배열 (3row n column)
		int[][] num = {{10,20,30},{40,50},{60}};
		//열의 구조가 각각 달라서 비정방형
		
		for (int i = 0; i < num.length; i++) { //row
			for (int j = 0; j < num[i].length; j++) { //column
				System.out.println(num[i][j]); //있는 것만 가져오면 되니까 2차원배열과 같다. 데이터가 들어있는 방식만 달라.
				
			}
		}
	}
	
}
