package ch08;
//싱글톤 기법 맛보기
public class MyManager {
	private int score;
	
	private MyManager(int score) {
		//생성자는 기본적으로 public을 써야하는데 private을 썼다.
		//외부에서 함부로 new 해서 또다른 객체를 생성하는 메모리 낭비를 방지.
		this.score = score;
	}
	private static MyManager mgr; //객체형데이터타입 참조변수.
	//static 은 new 하지 않고 멤버 접근 가능.
	
	public static MyManager getInstance() { //메서드 이름은 마음대로 정해o
		
		if(mgr==null) { //참조변수가 생성 전이면 ==> 처음 MyManager 가 객체화 될 경우 
			mgr=new MyManager(10);
		}
		return mgr; //한번 이상 객체가 어디선가 생성됐다면 그 주소값을 리턴. 
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public static MyManager getMgr() {
		return mgr;
	}
	public static void setMgr(MyManager mgr) {
		MyManager.mgr = mgr;
	}
}
