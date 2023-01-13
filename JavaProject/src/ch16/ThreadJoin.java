package ch16;

public class ThreadJoin extends Thread{
	//join() : join()을 호출한 스레드가 종료될 때까지 현재의 스레드를 대기시킴
	
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" 스레드가 시작되었습니다.");
		ThreadJoin e = new ThreadJoin();
		e.setName("스레드1");
		e.start();
		try {
			e.join();//새로운 작업 요청하면 기다렸다가 다시 실행. 싱글스레드처럼
			//main 스레드 실행됐다가 잠깐 스레드1 실행 -> 스레드1 종료 -> main()종료
			//sleep()은 특정시간만큼 대기, join()은 다른 스레드 완료까지 대기
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+" 스레드가 종료되었습니다.");
	
	
	}
	
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" 스레드가 시작되었습니다.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" 스레드가 종료되었습니다.");
	}
}
