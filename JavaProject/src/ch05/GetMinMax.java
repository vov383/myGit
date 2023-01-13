package ch05;
/*
 * 12-19 과제
 * 최소값 최대값 출력해보기.
 * 배열 활용.
 */
public class GetMinMax {

	public static void main(String[] args) {
		int data[] = {79, 88, 91, 33, 100, 55, 95};
		
		int min = 0;
		int max = 0;
		min = data[0];
		for(int i=1; i<data.length; i++) {
			if(min > data[i]) { //min 보다 data[i]가 작을 때 min에 값을 넣어야함. 주의.
				min = data[i];
			}
		}
		for(int i=0; i<data.length; i++) {
			if(max < data[i]) {
				max = data[i];
			}
		}
		
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
	}
}
