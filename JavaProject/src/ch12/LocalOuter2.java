package ch12;

public class LocalOuter2 {
	private int data = 20;
	void display() {
		class LocalInner2{
			int value = 50;
			void msg() {
				System.out.println(value); //member니까 당연히 접근 가능.
				System.out.println(data); //Outer의 private member에 접근 가능.
			}
		}
		LocalInner2 li2 = new LocalInner2();
		li2.msg(); 
		//LocalInner 생성하고 LocalInner 참조변수.메서드명 해서 호출해놓아야. 이거 안하면 실행 안됨.
	}
	
	
	
	
	public static void main(String[] args) {
		LocalOuter2 lo2 = new LocalOuter2();
		lo2.display();
	}
}
