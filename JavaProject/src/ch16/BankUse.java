package ch16;
//01-05 과제3
public class BankUse {
	public static void main(String[] args) {
		//MyBank mb = new MyBank();
		Thread t1 = new Thread(new BankPlayer("홍길동", 10));
		Thread t2 = new Thread(new BankPlayer("사임당", 20));
		Thread t3 = new Thread(new BankPlayer("이몽룡", 30));

		t1.start();
		synchronized (t1) {
			try {
				t1.wait();//t1 객체 끝날 때까지 기다려
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		t2.start();
		synchronized (t2) {
			try {
				t2.wait();//t2 스레드 돌때까지 기다려
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		t3.start();
	}
}
