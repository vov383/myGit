package ch05;
/*
배열 활용해서 여러 명의 성적 한번에 처리.
 */
public class ArrayPoint {

	public static void main(String[] args) {
		
		String[] name = {"홍길동", "이순신", "김춘수", "이몽룡", "성춘향"};
		int[] kor = {100,80,70,60,90};
		int[] eng = {80,90,95,85,75};
		int[] mat = {99,89,79,69,77};
		
		int[] tot = {0,0,0,0,0};
		double[] avg = new double[5];
		double tot_avg =0; //전체 평균
		
		for(int i=0; i<5; i++) {
			tot[i] = kor[i]+eng[i]+mat[i];
			avg[i] = tot[i]/3.0;
			tot_avg = tot_avg + avg[i]; //전체 평균 계산하는 방법. tot_avg 구해서 /5 하면 됨.
		}
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<5; i++) {
			System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+
		tot[i]+"\t"+String.format("%.1f", avg[i]));
		//출력문 중간에 형식 지정할 때 +String.format("형식지정자", 출력하고자 하는 변수)+ 이렇게 끼워넣으면 됨.
			
		}
		System.out.println("학급 평균 : "+String.format("%.1f", tot_avg/5));
	}
}
