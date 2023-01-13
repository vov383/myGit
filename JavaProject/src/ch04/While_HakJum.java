package ch04;
/*
12-16 과제

 */
import java.util.Scanner;

public class While_HakJum {

	public static void main(String[] args) {
		int kor;
		int eng;
		int mat;
		
		int tot;
		double avg;
		char grade =' ';
		int num;
		
		String result = "";
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("전체 성적입력이 끝나면 마지막에 -1을 입력하세요.");
		System.out.print("아무 정수나 입력하세요 : ");
		num = scan.nextInt();
		
		while(num != -1) {
			kor = num;
			int count=1;
			
			while(count<=3 ) {
				System.out.print("계속 하려면 아무 정수나 입력하세요 : ");
				num = scan.nextInt();
				
				eng = num;
				count++;
				
				System.out.print("계속 하려면 아무 정수나 입력하세요 : ");
				num = scan.nextInt();
				mat = num;
				count++; //count = 3
				
				System.out.println("국어 : "+kor);
				System.out.println("영어 : "+eng);
				System.out.println("수학 : "+mat);
				
				tot = kor + eng + mat;
				avg = tot/3.0;
				avg = (Math.round(avg*100))/100.0;
				//등급 정하기
				if(avg > 90) {
					grade = '수';
				} else if (avg>80)
					grade = '우';
				else if (avg>70)
					grade = '미';
				else if (avg>60)
					grade = '양';
				else {
					grade = '가';
				}
				result += kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg+"\t"+grade+"\n";
				
				System.out.print("계속 하려면 아무 정수나 입력하세요 : ");
				num = scan.nextInt(); 
				count++;
				
			} //end inner while()
			
			
		
		} //outer while()
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println(result);
	} //end main()
}

	
