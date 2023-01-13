package ch16;

public class JoinExam {

	public static void main(String[] args) {//main스레드는 우선권이 제일 높다.
		MyThread3 thread = new MyThread3();
		thread.start();
		System.out.println("Thread가 종료될 때까지 기다립니다.");
		try {
			thread.join();//해당 스레드가 실행종료될때까지 main스레드는 일시정지 상태로 전환. 끝나면 runnable로 전환되고 run됨
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread가 종료되었습니다.");
	}
}
