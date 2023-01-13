package ch12;

class Outer{
	class InstanceInner{
		int a = 100;
	} //end inner class
	
	static class StatticInner{
		int a = 200;
		static int b = 300;
	}//end static inner class
	
	void myMethod() {
		class LocalInner{
			int a = 400;
		}
		LocalInner i = new LocalInner(); //Local inner 는 메서드 안에서 생성을 해놨음. 미리 다 처리해놓음.
		System.out.println("i.a : "+ i.a);
	}//method
	
}


public class InnerEx4 {
	public static void main(String[] args) {
		Outer oc = new Outer(); //Outer를 먼저 메모리에 올려
		Outer.InstanceInner ii = oc.new InstanceInner(); //inner class 생성하는 법.
		
		System.out.println("ii.a : "+ii.a);//static 안에서 static 호출은 자유롭게 가능.
		
		System.out.println("Outer.StatticInner.b : "+Outer.StatticInner.b); //생성 안하고 무리없이 호출 가능.
//		System.out.println("Outer.StatticInner.b : "+Outer.StatticInner.a); 
		//static class 안에 인스턴스 member는 생성 후 참조변수.멤버변수로 접근
		
		Outer.StatticInner si = new Outer.StatticInner(); 
		//static inner는 바로 new 하고 Outer.생성자로 생성
		
		oc.myMethod(); //LocalInner 는 이미 생성 해놨으니까 Outer참조변수.memberMethod 해서 바로 호출 가능.
		
		
		
		
		
		
		
	}
}
