package ch16;

public class Priority extends Thread{
	public static void main(String[] args) {
		Priority e1 = new Priority();
		Priority e2 = new Priority();
		
		//스레드 이름생성
		e1.setName("스레드1");
		e2.setName("스레드2");
		System.out.println("e1의 기본 우선순위 : "+e1.getPriority());
		System.out.println("e2의 기본 우선순위 : "+e2.getPriority());
		
		//우선순위 지정. 100프로는 아님. 실행할때마다 달라져
		//e1.setPriority(7);//숫자로 지정 can, but 상수값으로 해야 그나마 cpu에 반영 잘 됨
		e1.setPriority(Thread.MIN_PRIORITY);//정식문법. 최소우선순위.
		e2.setPriority(MAX_PRIORITY);//Thread.생략가능. 최대우선순위.
		e1.start();
		e2.start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+"==>"+(i+1));
		}
	}
	
	
}
