package ch14;

import java.util.Stack;

public class StackExam {

	public static void main(String[] args) {
		
		String[] nation = {"한국", "미국", "중국", "일본", "영국"};
		Stack<String> s = new Stack<>();//Stack 구조 LIFO
		for (String str : nation) {
			s.push(str);//스택에 자료입력
		}
//		System.out.println(s.pop());//stack에서 데이터 출력
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());//stackUnderFlow 에러 (EmptyStackException)
		
		//보통 꺼낼 때 while()을 쓴다.
		while(!s.isEmpty()){//isEmpty()는 스택이 비어있냐? => !isEmpty()는 스택이 차있냐는 뜻.
			System.out.println(s.pop());
		}
	}	
}
