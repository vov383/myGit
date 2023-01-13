package ch16;

public class YieldExam implements Runnable{

	public static void main(String[] args) {
		Thread t = new Thread(new YieldExam());//Runnable은 Thread 생성 have to
		t.start();
		for (int i = 0; i < 5; i++) {
			if(i==3) {
				Thread.yield();//running상태에서 runnable로 전환... wait이랑 달라 //다른 스레드에게 실행 양보 //끝나면 자동복귀
			}
			System.out.println("main 스레드");
		}
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("run()에서 실행되는 스레드");
		}
	}

}
