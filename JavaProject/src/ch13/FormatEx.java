package ch13;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatEx {

	public static void main(String[] args) {
		
		//3자리수 콤마 표시
		//1) String에서 제공하는 method
		int val = 1234567890;
		String str = String.format("%,d", val);
		System.out.println(str);
		
		
		//2) DecimalFormat 을 활용
		DecimalFormat df = new DecimalFormat("###,###.##");//원하는 포맷 지정
		String num = df.format(123000000000.3222222);
		System.out.println(num);
		
		//3) NumberFormat 을 활용
		NumberFormat nf = NumberFormat.getInstance();
		String num2 = nf.format(1230000.1234);//얘는 해당국가 포맷으로 자주 쓴다.
		System.out.println(num2);
		
		//getInstacne(Locale.국가) ==> 해당국가의 표기법으로, 기본은 미국꺼.
		NumberFormat nf2 = NumberFormat.getInstance(Locale.ITALY);
		String num3 = nf2.format(1230000.12345);
		System.out.println(num3);
		
	}
}
