package ch05;

public class StringArray {

	public static void main(String[] args) {
		String[] str = {"java", "DB", "JSP", "HTML"}; 
		for(int i=0; i<str.length; i++) { //일반 for문
			System.out.println(str[i]);
			
		}	
		System.out.println("-------------");
		//확장 for문, 향상된 for문, enhanced for문. jdk 1.5부터 사용가능
		//for(계별 값 저장할 수 있는 변수(자료형과 변수명) : 집합변수(배열참조변수) ){ }
		//앞으로 많이 쓸 거다. 객체를 다룰 때 특히 많이 사용.
		for(String ss : str) {
			System.out.println(ss);
		}
		
	}
	
}
