package ch09;

public class InheritanceEx  {

	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		Ball c2 = new Ball("빨간색"); //객체 생성과 동시에 매개변수가 있는 생성자 호출. 		
		System.out.println("원 :");
		c1.findRadius();
		c1.findArea();
		//c1.secret(); //private 처리된 멤버는 타 클래스에서 접근 불가능
		
		System.out.println("공 : ");
		c2.findRadius(); //자식 참조변수로 부모 멤버 메서드에 접근. 상속 덕분에 가능. 
		c2.findColor();
		c2.findArea();
		c2.findVolume();
		
		Circle c3 = new Circle(4); //생성자인데 매개변수 int값 있는 거. 
		Ball c4 = new Ball(); //이때 주의. 기본 생성자 호출 시 해당 클래스에 명시적으로 코딩 되어 있어야.
	}
}
