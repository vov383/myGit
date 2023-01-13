package ch16;
//01-05 과제2
public class Thread_Im implements Runnable{

	@Override
	public void run() {
		synchronized(this) {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName()+"==>"+(i+1));
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			notify();
		}
	}

}
