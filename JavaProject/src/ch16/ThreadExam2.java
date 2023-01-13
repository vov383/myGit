package ch16;

public class ThreadExam2 {

	public static void main(String[] args) {
		MyThread2 r1 = new MyThread2("*");
		MyThread2 r2 = new MyThread2("-");
		
		//if Runnable을 implements 받으면??? >>> Thread를 별도 생성 have to
		Thread t1 = new Thread(r1);//매개변수 1개짜리, 2개짜리 있다. 객체 참조변수를 매개변수로 던져
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		System.out.print("!!!!");//main()이 먼저 실행.
		
	}
}
