package ch05;
//향상된 for문
public class StringArray2 {

	public static void main(String[] args) {
		String[] str = {"Java", "DB", "JSP", "Spring"};
	/*
	 * 일반 for문
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
	*/	
		
		//향상된 for문으로 바꿔봐.
		//for(데이터 타입 개별변수(아무거나 적어도 됨) : 집합변수(배열참조변수)){ }
		//객체지향으로 넘어가서 아주 많이 쓸 것. 
		for(String ss: str) {
			System.out.println(ss);
		}
	}
}
