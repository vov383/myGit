package ch16;

public class MusicBox {
	//모니터링 락 (객체의 사용권)
	public synchronized void playMusicA() {
		for (int i = 0; i < 10; i++) {
			System.out.println("가요 음악");
		}
		try {
			Thread.sleep((int)(Math.random() * 1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	public synchronized void playMusicB() {
		for (int i = 0; i < 10; i++) {
			System.out.println("팝송 음악");
		}
		try {
			Thread.sleep((int)(Math.random() * 1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	//얘만 synchronized 빼고 실행해보자
	public synchronized void playMusicC() {
		for (int i = 0; i < 10; i++) {
			System.out.println("클래식 음악");
		}
		try {
			Thread.sleep((int)(Math.random() * 1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
