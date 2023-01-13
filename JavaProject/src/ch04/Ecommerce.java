package ch04;
/*
 * 쇼핑몰 간단하게 구현
 * 변수 선언 String int ....
 * Scanner로 변수값 입력 받아서
 * if문을 활용해서 지불할 결제 금액을 계산
 * 출력문에서 printf 형식지정자에 주의.
 * printf()에서 형식지정자 주의 문자열은 %s, 실수형은 %f
 */
import java.util.Scanner;

public class Ecommerce {

	public static void main(String[] args) {
		//변수선언
		String name="";
		int price =0; //구매금액
		int point = 0; //포인트
		int point_use =0; //포인트 사용액
		int fee = 0; //배송료
		int pay = 0; //실제 결제금액

		//자료 입력
		Scanner scan = new Scanner(System.in);
		System.out.println("이름 : ");
		name = scan.next(); //문자열 입력받게 하는 메서드
		System.out.println("구매금액 : ");
		price = scan.nextInt();
		System.out.println("보유 포인트 : "); //정수를 입력받게 하는 메서드
		point = scan.nextInt();
		scan.close();
		
		//계산
		if (price < 20000) { //구매금액 2만원 미만일 때
			fee = 2500; //배송비 2500원 처리
		} 
		if (point >= 10000) { //포인트가 1만점 이상
			point_use = point; //포인트 사용
			pay = price + fee - point;
		}else {
			pay = price + fee;
		}
		//출력
		System.out.println("이름\t구매금액\t배송료\t포인트사용\t결제금액");
		System.out.println(name+"\t"+price+"\t"+fee+"\t"+point_use+"\t"+pay);
		System.out.printf("%s\t%d\t%d\t%d\t%d", name, price, fee, point_use, pay); 
		//printf()에서 형식지정자 주의 문자열은 %s
	
	}
}
