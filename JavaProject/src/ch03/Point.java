package ch03;

import java.util.Scanner;

//국어, 영어, 수학 점수를 입력받아 총점, 평균 출력

//Scanner(System.in)
//scan.next() 로 입력값 assign 하기
//int형을 double에 넣기위해 형변환 	// \t (키보드 탭만큼 거리 떨어트려줌)	
//printf() 주의사항 지정한 형식의 데이터타입 맞추기, %문자의 갯수와 출력할 값의 갯수 맞추기

public class Point {
	
	public static void main(String[] args) {
		//변수 선언
		String name;
		int kor, eng, mat, tot;
		double avg;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		name = scan.next();
		System.out.print("국어 점수 : ");
		kor = scan.nextInt();
		System.out.print("영어 점수 : ");
		eng = scan.nextInt();
		System.out.print("수학 점수 : ");
		mat = scan.nextInt();
		
		scan.close();  //안해도 jvm이 자동으로 메모리에서 제거함. 그래도 쓰는 것이 좋다.
		
		//계산
		tot = kor + eng + mat;
		
		//실수형이기 때문에 나누는 수도 3.0으로 표시하는 것이 좋다.
		avg = (double)tot/3.0; 
		
		// \t ==> tap키만큼 떨어뜨려줌.
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg);
		
		//printf() //아직 익숙하지 않음. 		//소수점이하 한자리만, 개행
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%3.1f\n", name, kor, eng, mat, tot, avg);
		
		//println 으로 처리하고 싶어
		System.out.println("==========");
		System.out.println(String.format("%s\t%d\t%d\t%d\t%d\t%.1f", name, kor, eng, mat, tot, avg));
	}
}
