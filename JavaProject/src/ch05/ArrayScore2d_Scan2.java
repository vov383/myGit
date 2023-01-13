package ch05;
// 12-20 과제
// 박민석 코드 리뷰
import java.util.Scanner;

public class ArrayScore2d_Scan2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String tmp;
		
		System.out.print("학생수를 입력하세요 : ");
		tmp = in.next();
		int size = Integer.parseInt(tmp);
		
		int[][] intArray = new int[size][3];
		
		System.out.println("국, 영, 수 점수를 각각 입력하세요 :");
		for(int i = 0; i < intArray.length; i++) {
			System.out.print(i+1 + "번 학생의 점수 : ");
			for(int j = 0; j < intArray[i].length; j++) {
				tmp = in.next();
				intArray[i][j] = Integer.parseInt(tmp);
			}
		}
		in.close();
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");
		for (int i = 0; i < intArray.length; i++) {
			int sum = 0; //총점
			float avg = 0.0f; //평균
			System.out.printf("%d\t", i+1); //번호 출력
			for(int j = 0; j < intArray[i].length; j++) { //국, 영, 수 배열값 처리
				sum += intArray[i][j];
				System.out.printf("%d\t", intArray[i][j]);
			}
			avg = sum/(float)intArray[i].length; //평균 계산
			
			String grade;
			switch((int)avg/10) {
			case 10: grade = "A"; break;
			case 9: grade = "A"; break;
			case 8: grade = "B"; break;
			case 7: grade = "C"; break;
			case 6: grade = "D"; break;
			default : grade = "F"; break;
			
			}
			//출력
			System.out.printf("%d\t%.1f\t%s%n", sum, avg, grade);
		}
		
	}
}
