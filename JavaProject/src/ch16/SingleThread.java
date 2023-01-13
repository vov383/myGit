package ch16;

public class SingleThread {

	void print() {//non-static
		//currentThread() => 현재 실행중인 스레드
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			
		}
	}
	
	public static void main(String[] args) {
		SingleThread t = new SingleThread();
		t.print();//main()도 스레드였다. 싱글스레드. 작업 단위 1개(main만 존재) 순차적으로 작업 처리
		t.print();
	}
}
