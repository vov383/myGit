package ch09;

public class SaleUse {

	public static void main(String[] args) {
		
		Sale s1 = new Sale(); //객체생성. super도 자동으로 생성.
		
		//데이터 입력
		s1.input(1, "냉장고", "LG", "20220103", 200, 5);
		s1.calc();
		s1.print();
	}
}
