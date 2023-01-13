package ch13;

import java.util.StringTokenizer;
//String을 분리하자
public class StrToken {

	public static void main(String[] args) {
		
		String str = "kim,20,180,55,서울,학생";
		
		String[] items = str.split(",");//콤마(,)기준으로 데이터 분리
		for(String s : items) {//forEach() 개별변수 : 집합변수
			System.out.println(s);
		}
		
		//토큰이란 분리된 데이터?
		//String.split 보다 StringTokenizer는 다양한 메서드들을 제공
		StringTokenizer st = new StringTokenizer(str, ",");
		int cnt = st.countTokens();//토큰의 개수
		System.out.println("토큰 개수 : "+cnt);
		
		System.out.println("-----");
		
		while(st.hasMoreTokens()) {//객체 안에 토큰이 하나라도 존재하면 true, 없으면 false를 return
			System.out.println(st.nextToken());//객체 안 토큰 하나하나 가져와 반환.
		}
		
		
	}
}
