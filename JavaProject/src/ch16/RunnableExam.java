package ch16;

public class RunnableExam implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+"==>"+(i+1));
		}
	}//end run()

	public static void main(String[] args) {
		
		RunnableExam e1 = new RunnableExam();
		
		//when Runnable을 implements ? >>> Thread 별도 생성 have to
		//new Thread(스레드구현객체, "스레드이름")
		Thread t1 = new Thread(e1, "스레드1");
		Thread t2 = new Thread(e1, "스레드2");
		Thread t3 = new Thread(e1, "스레드3");
		//왜? Runnable이 더 많이 쓰여? >>> java는 단일상속만 가능. 다른 객체와 함께 상속받아 스레드 구현하려면
		//implements Runnable로 처리
		
		t1.start();
		t2.start();
		//t1.run() 하면 main()인 싱글스레드가 돌아간다. 그래서 start()를 쓴다.
//		t1.run();
	}
}
