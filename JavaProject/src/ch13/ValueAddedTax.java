package ch13;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValueAddedTax {

	public static double valueOfSupply;//static member, 공급가액 0.0 
	public static int vatRate = 10;//부가세율.
	
	public static double getVat() {
		return valueOfSupply / vatRate;
	}
	public static double getTotal() {
		return valueOfSupply + getVat();
	}
	
	public static void main(String[] args) {
		DecimalFormat decFormat = new DecimalFormat("###,###");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("공급 가액을 입력하세요 : ");
		ValueAddedTax.valueOfSupply = Double.parseDouble(scan.nextLine());//문자열 입력받아서 double로 바꿔
		System.out.println("***************");
		System.out.println("공급 가액 : "+decFormat.format((int)valueOfSupply)+ "원");
		System.out.println("부가세율 : "+vatRate+"%");
		System.out.println("부가가치세 : "+decFormat.format((int)getVat())+"원");
		System.out.println("합계 : "+decFormat.format((int)getTotal())+"원");
		System.out.println("***************");
		scan.close();
		
		
		
		
	}
}
