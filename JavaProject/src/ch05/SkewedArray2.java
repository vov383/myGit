package ch05;
//비정방형 배열(가변형, 레그드 배열)
public class SkewedArray2 {

	public static void main(String[] args) {
		int[][] intArray = new int[4][]; //열을 빈값으로 놔둬 그리고 데이터를 집어넣는다.
		intArray[0] = new int[3]; //1행에 3개의 열 생성하겠다. 
		intArray[1] = new int[2]; //2행에 2개의 열 생성하겠다. 
		intArray[2] = new int[3]; //3행에 3개의 열 생성하겠다. 
		intArray[3] = new int[2]; //4행에 2개의 열 생성하겠다. 
		
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) { //안쪽 for문은 열처리. 반드시 배열첨자[i].length 넣어야.
				intArray[i][j] = (i+1)*10 + j; //돌아가면서 데이터 입력하도록
				
			}
		} 
		//출력
		for (int i = 0; i < intArray.length; i++) { //행
			for (int j = 0; j < intArray[i].length; j++) { //열
				System.out.print(intArray[i][j]+" ");
				
			} //inner for()
			System.out.println(); //열 바뀌면서 개행
		} //outer for()
	}	
}
