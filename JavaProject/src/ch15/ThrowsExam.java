	package ch15;

public class ThrowsExam {
	//예외처리 방법 2가지
	//1) try catch 직접처리
	//2) throws 예외처리 클래스에 위임시켜.
		//주의! throws 와 throw를 구분하라.
	public static void main(String[] args) throws InterruptedException {
		
		for (int i = 1; i <= 10; i++) {	
			System.out.println(i);
			Thread.sleep(1000);//Interrupt(cpu 간섭) //에러 빨간줄에 마우스 대고 Add throws 클릭. 
			//try catch절 대신 throws 뒤에 지정한 예외처리클래스에 처리를 위임. jvm이 지정해줌
			
		}
	}
}
