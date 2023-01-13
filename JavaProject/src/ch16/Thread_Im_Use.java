package ch16;
//0105 과제2
public class Thread_Im_Use {

	public static void main(String[] args) {
		
		Thread_Im e1 = new Thread_Im();
		Thread t1 = new Thread(e1, "스레드1");//Runnable로 스레드 생성할 때 parameter 2개.
		Thread t2 = new Thread(e1, "스레드2");
	
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t2.start();
		t1.start();

		synchronized (t2) {
			try {
				t2.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
