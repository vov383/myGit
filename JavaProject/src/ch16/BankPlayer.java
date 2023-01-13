package ch16;
//01-05 과제3
public class BankPlayer extends MyBank implements Runnable{

	MyBank mb = new MyBank();
	
	public BankPlayer() {
		
	}
	public BankPlayer(String name, int account) {
		mb.setName(name);
		mb.setAccount(account);
	}
	
	@Override
	public void run() {
		switch (mb.getName()) {
		case "홍길동" : mb.put1(); break;
		case "사임당" : mb.put2(); break;
		case "이몽룡" : mb.put3(); break;
		}
	}
	
	
	
}
