package ch13;

public class StrBuilder {
	public static void main(String[] args) {
		//String은 불변
		//StringBuilder 가변
		
		//StringBuffer str1 = new StringBuffer();//초기버전용
		StringBuilder str1 = new StringBuilder();//최신버전용
		//StringBuilder는 일반객체. String과 달리 new 해주어야.
		
		str1.append("java");//append()는 문자열 내용 추가, 메모리 절약
		System.out.println(str1.toString());//출력할 때 toString 사용할 수 있음.
		
		str1.append(" programming");
		System.out.println(str1);
		
		str1.replace(0, 4, "jsp");//0~3 index 내용을 변경(java->jsp)
		//참고로 replace()는 주로 String객체의 replace를 많이 쓰는 편이다.
		System.out.println(str1);
		String str2 = str1.substring(3);//index 3~end
		System.out.println(str1);
		System.out.println(str2);
		
		//StringBuilder type을 String에 저장
		String str3 = str1.toString();//반드시 toString() 해주어야.
		System.out.println("StringBuilder(str1)->String(str3)에 저장 : " + str3);
		
		//String을 StringBuilder에 저장할 때
		str1 = new StringBuilder(str3);//new StringBuilder() 로 담는다.
		System.out.println("String(str3)-> StringBuilder(str1)에 저장 : " +str1);
	}
}
