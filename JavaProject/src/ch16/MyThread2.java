package ch16;

public class MyThread2 implements Runnable{

	String str;
	public MyThread2(String str) {
		this.str = str;
	}



	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(str);
			try {
				Thread.sleep((int)(Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
	}

	
}
