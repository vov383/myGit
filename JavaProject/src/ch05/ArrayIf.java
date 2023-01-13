package ch05;

public class ArrayIf {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50,60,70,80,0,100}; //참조형 데이터 타입
		if(arr != null) { //arr 이 주소번지가 null이 아닌 조건이면 for문으로 처리해라. 이건 권장사항. 코드가 안정적임.
			for(int i=0; i<arr.length; i++) { 
				System.out.print(arr[i]+",");
			}
	
		}
	}	
}
