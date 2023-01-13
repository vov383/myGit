package ch16;

public class MusicBoxExam1 {

	public static void main(String[] args) {
		
		MusicBox box = new MusicBox();
		
		MusicPlayer kim = new MusicPlayer(1, box);
		MusicPlayer lee = new MusicPlayer(2, box);
		MusicPlayer choi = new MusicPlayer(3, box);
		
		//스레드 실행
		kim.start();
		lee.start();
		choi.start();
		//3사람이 동시에 뒤죽박죽 실행...
		//how 하나씩 실행??
		//모니터링 락 synchronized
		//가요음악 다 듣고 나서 다음 음악 실행. 
		//순서는 바뀌지만 하나의 method가 다 실행되고 다른 thread가 처리됨
		//하나만 synchronized 빼고 실행했더니 중간중간 껴들어
		//synchronized는 하려면 모두 해야
		
		//synchronized를 특정 부분에다만 걸 수도 있다.
		//synchronized(this){ } 블럭안에 특정 코드를 집어넣어
		//이렇게 하면 중간중간 껴드는 애가 생겨. lose 발생한다. 완벽하게 처리할 때는 사용 못함. 그래서 권장X
		
		//synchronized(this){ } 이런 기법이 왜 나왔나??
		//메서드 코드 길어지면, 마지막에 대기하는 스레드가 너무 오래 기다리는 것 막기 위해
		//메서드 head에 synchronized 처리 안하고 필요한 부분만 synchronized 블록을 사용할 수 있다.
	}
}
