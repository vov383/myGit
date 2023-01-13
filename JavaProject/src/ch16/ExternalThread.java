package ch16;

public class ExternalThread {

	public static void main(String[] args) {
		MyThread t1 = new MyThread("스레드1");
		MyThread t2 = new MyThread("스레드2");
		MyThread t3 = new MyThread("스레드3");
		
		t1.start();//run() 호출
		t2.start();
		t3.start();
		System.out.println("메인스레드");//다른 스레드 run하는 시점에 메인스레드의 내용도 있으면 메인부터 실행되는 현상
		//먼저 메인부터 시작되는 현상.
		//100퍼센트는 아님. 우선권이 있다.
	}
}
