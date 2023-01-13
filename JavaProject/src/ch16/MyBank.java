package ch16;
//01-05 과제3
public class MyBank {

	private String name;
	private int account;

	public  void put1() {
		synchronized(this) {

			for (int i = 0; i < 5; i++) {
				System.out.println(name+"님의 통장잔고는 "+account+"만원입니다.");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				account+=10;
			}	
			System.out.println();
		}
	}
	public void put2() {
		synchronized(this) {
			for (int i = 0; i < 5; i++) {
				System.out.println(name+"님의 통장잔고는 "+account+"만원입니다.");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				account+=10;
			}
			System.out.println();
		}
	}
	public synchronized void put3() {
		synchronized(this) {

			for (int i = 0; i < 5; i++) {
				System.out.println(name+"님의 통장잔고는 "+account+"만원입니다.");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				account+=10;
			}
			System.out.println();
		}
	}

	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
