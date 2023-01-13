package ch04;
/*
Random 클래스 사용해보기
난수를 생성한다
난수의 개수를 Scanner 로 입력 받으면
인스턴스명 뒤에 . 으로 접근 가능한 메서드 호출
a += b 로 변수 누적시키기
*/
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		Random  generator = new Random(); //난수를 발생시키는 랜덤함수 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("난수의 개수 : ");
		int count = sc.nextInt();
		int sum =0;
		sc.close();
		
		for(int i=0; i<count; i++) { 
			int number = generator.nextInt(100); //0~99사이의 난수발생
			System.out.println("생성된 난수 : "+ number);
			sum += number; //sum=sum+number; 반복해서 sum을 누적시켜
		}
		System.out.println("난수 "+count+" 개의 합은 "+sum);
	}
}
