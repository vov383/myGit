package ch08;

public class MyManagerUse {

	public static void main(String[] args) {
		//1) getInstance() 호출할 때 처음이면 score 값을 10으로 초기화.
//		MyManager mgrobj = new MyManagerUse() //new 로 객체화 하려하면 오류남. private 이라서 접근 불가.
		MyManager mgrobj = MyManager.getInstance(); //이렇게 인스턴스 생성해야함.
		System.out.println(mgrobj); //주소값 출력
		System.out.println("mgrobj.getScore() : "+mgrobj.getScore()); //10 나옴
		mgrobj.setScore(100);
		System.out.println("mgrobj.getScore() : "+mgrobj.getScore()); //100으로 set한 값 나옴.
		
		//2) getInstance() 2번째 호출. 기존 객체의 주소값을 리턴.
		//객체를 하나 생성을 해놓고 객체를 또 하나 호출해서 처리할 때 원래는 다른 메모리 번지에 생성되는데
		//객체 하나만 만들어 놓고 해당되는 메서드를 실행해.
		//생성자를 private 처리.
		//getInstance()를 static으로 선언해서 우회해서 인스턴스를 생성하도록 함.
		
		MyManager newMgr = MyManager.getInstance(); 
		System.out.println(newMgr); //주소값 출력했더니 같음을 확인.
		System.out.println();
		System.out.println("newMgr.getScore() : "+newMgr.getScore()); //저장된 100이 그대로 출력.
	}
}
