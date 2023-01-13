package ch12;

public class LocalOuter {
	private int data = 30;
	void display() { 
		class LocalInner {
			void msg() {
				System.out.println(data); //private이라도 inner class는 바로 갖다 쓸 수 있음.
			}
		}//end inner class
		LocalInner li = new LocalInner();//memberMethod 안에서 생성 끝내야.
		li.msg();
	} //end display()
	
	
	
	
	
	public static void main(String[] args) {
		
		LocalOuter lo = new LocalOuter(); //display()는 non-static //객체 생성 후 접근하여야
		lo.display();
		
	}
}
