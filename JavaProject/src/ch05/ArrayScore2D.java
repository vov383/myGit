package ch05;
/*
12-20 과제
Array2Point2 참고. 아래처럼 등급까지 나올 수 있게 출력.
(90(A) > 80(B) ----F)
 */
public class ArrayScore2D {

	public static void main(String[] args) {
		//5행 x 5열
		double[][] point = {{100,100,100,0,0},{89,76,92,0,0},{88,69,72,0,0}
		,{45,60,59,0,0},{96,92,89,0,0}};

		//출력
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");
		for (int i = 0; i < point.length; i++) { //행
			int sum=0;
			double avg = 0.0;
			char grade = ' ';			
			System.out.printf("%d\t",i+1); //번호 출력
			for (int j = 0; j < point[i].length-2; j++) { //열 
				//평균이랑 총점은 여기서 출력 안할 거니까 j-2까지만 for문 돌려
				sum += point[i][j]; //점수 누적
				System.out.printf("%.0f\t", point[i][j]); //배열에 성적 값 집어넣기 
			}
			avg = sum/3.0; //평균 구하기
			if(avg > 90) { //등급 매기기
				grade = 'A';
			}else if (avg > 80) {
				grade = 'B';
			}else if (avg > 70) {
				grade = 'C';
			}else if (avg > 60) {
				grade = 'D';
			} else {
				grade = 'F';
			} //end if-else
			
			for(int j=0; j<point[i].length; j++) { //배열에 총점, 평균 값 집어넣기.
				point[i][3] = point[i][3]=point[i][0]+point[i][1]+point[0][2];
				point[i][4] = point[i][3]/3.0;
			}
			System.out.printf("%d\t%.1f\t%c%n", sum, avg, grade); //총점, 평균 값 마저 출력
		} //end outer for()
	}
}

