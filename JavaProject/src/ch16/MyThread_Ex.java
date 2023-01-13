package ch16;

public class MyThread_Ex extends Thread{

	public MyThread_Ex() {
//		super(name);//부모생성자 호출 - 타이틀 설정
		
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+"==>"+(i+1));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
