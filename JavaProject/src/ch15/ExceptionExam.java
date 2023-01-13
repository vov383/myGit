package ch15;

public class ExceptionExam {

	public static void main(String[] args) {
		int a=10, b=0, c;//local var
		
		try {
			c=a/b;//0으로 나눔
			System.out.println(c);//Error : Exception in thread "main" java.lang.ArithmeticException: / by zero
			
//		} catch (ArithmeticException e) {//익셉션 구체적으로 잡는 것이 좋다.
		} catch (Exception e) {//어떤 익셉션인지 잘 모를때 Exception만 해도 된다.
			System.out.println("0으로 나눌 수 없다.");//안내를 해주면 됨. 
			//개발자라면 코드를 역추적하기위한 장치를 만들어
//			e.printStackTrace();//Exception에서 제공하는 예외 발생한 상태의 스택 정보출력 메서드
		}
		System.out.println("programm end");
		
	}
}
