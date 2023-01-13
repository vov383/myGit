package ch16;

//멀티 스레드 : 작업단위 2개 이상
//멀티 스레드 구현 방식
//1. Thread 상속
//2. Runnable 구현
public class ThreadExam extends Thread{
	public ThreadExam(String name) {
		super(name);//부모생성자 호출 - 타이틀 설정
	}

	@Override//반드시 오버라이드
	public void run() {//스레드 실행 메서드
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);//cpu stop 1sec (밀리세컨 단위인가보네)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		ThreadExam e1 = new ThreadExam("thread01");
		ThreadExam e2 = new ThreadExam("thread02");
		ThreadExam e3 = new ThreadExam("thread03");
		
//		e1.run();//그냥 런하면 안돼. 그냥 run()하면 main thread가 작동함
		e1.start();//스레드 작동 //tart()를 써서 자동으로 run() 호출
		//스레드 객체참조변수.start() => run() 호출됨
		
		e2.start();//위와 동시에 호출
		e3.start();//위와 동시에 호출
		
		// 3 1 2 3 2 1 2 3 1 1 .... 순서가 지 맘대로임
		
		
	}
}
