package ch03;
//문자열과 + 연산자
//문자열 += 문자열 => 문자열 누적
public class StringExam {

	public static void main(String[] args) {
		
		//+는 문자열이 포함된 연산에서는 연결 연산자가 된다.
		// 문자열 += 문자열 ==> 누적된다. 
		
		String str = "Hello " + "java"; //문자열 연결
		System.out.println(str);
		str = 123 + "C"; //숫자+문자열 ==> 문자열 
		System.out.println(str);
	
		str += "Programmer"; //str = str+"Programmer
		System.out.println(str);
	}
	
}
