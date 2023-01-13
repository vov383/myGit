package ch16;

class ATM implements Runnable{

	private long accBalance = 10000;//통장잔고
	
	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				notify();//일시정지상태 스레드를 깨워
				//wait하고 있는 스레드(한개만)에 notify 신호 보내. 여러 스레드가 wait하고 있으면??
				//한 스레드만 깨운다. 어떤 스레드 깨울지 알 수 없어. cpu 마음
				//wait하고 있는 스레드 없는경우?? notify 신호 소멸
				
				//notifyAll() : wait하고 있는 스레드 모두 깨워. 이때 깨어나는 순서는 몰라.
				//wait하고 있는 스레드 없으면 신호 소멸.
				try {
					wait();
					Thread.sleep(1000);//1초 대기한다
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(getAccount() <= 0) {
					break;
				}
				withDraw(1000);
			}
		}
	}

	private void withDraw(long cash) {//출금거래 메서드
		if(getAccount() > 0) {
			accBalance -= cash;//잔액에서 1000원 인출
			System.out.print(Thread.currentThread().getName() + ',');
			System.out.printf("잔액 : %,d 원 %n", getAccount());
		}else {
			System.out.println("잔액이 부족합니다.");
		}
		
	}

	public long getAccount() {//타입 안 맞추면 에러
		return accBalance;
	}
	
}

public class ATMsync {

	public static void main(String[] args) {
		ATM atm = new ATM();
		Thread mom = new Thread(atm, "mom");
		Thread son = new Thread(atm, "son");
		mom.start();
		son.start();
	}
}
