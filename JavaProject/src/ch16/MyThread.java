package ch16;


public class MyThread extends Thread {

	public MyThread(String name) {
		super(name);
	}
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);//1초 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
