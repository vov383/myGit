package ch16;

public class MyThread_Ex_Use {

	public static void main(String[] args) {
		MyThread_Ex t1 = new MyThread_Ex();
		MyThread_Ex t2 = new MyThread_Ex();
		t1.setName("스레드1");
		t2.setName("스레드2");
		
		t1.setPriority(Thread.MAX_PRIORITY);//Thread를 때면 왜 에러날까?
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
	}
}
