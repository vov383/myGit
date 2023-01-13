package ch13;

//인스턴스 복제하려면 Clonealbe을 implements 하여야.
public class Clone implements Cloneable{

	int num = 10;
	void print() {
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		Clone t1 = new Clone();
		Clone t2 = null; //일부러 주소값을 null로 세팅.
		try { //try catch문. 예외가 발생할 코드를 try존에 써.
			t2 = (Clone)t1.clone(); //Object의 method clone() => 인스턴스 복제.
			//좌변은 Clone type, 그래서 우변의 Object type을 Clone에 맞춰서 형변환.
			//좌변 우변은 같거나, 다르다면 좌변이 큰 타입이 되어야.
			
		} catch (Exception e) { //예외가 발생한 시점에서 처리됨.
			e.printStackTrace(); //개발자를 위한 디버깅 정보 제공 ==> 에러 역추적해서 잡는 것.
		}
		System.out.println(t1);
		System.out.println(t2); //주소값 달라.
		t1.print();
		t2.print(); //내용은 같음.
	}
	
	
}
