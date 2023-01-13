package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListBook {

	public static void main(String[] args) {
		List<Book> list = new ArrayList<>();
		System.out.println("3건의 도서자료를 입력하세요.");
		Book b1 = new Book();
		b1.input();
		Book b2 = new Book();
		b2.input();
		Book b3 = new Book();
		b3.input();

		//리스트에 Book 인스턴스 추가
		//객체를 ArrayList에 담을 수 있다.
		//컬렉션은 객체를 자료형으로 이용할 때 주로 사용
		list.add(b1);
		list.add(b2);
		list.add(b3);

		System.out.println("도서명\t출판사\t단가\t판매부수\t금액");
		for(Book bb : list) {
			System.out.println(bb.getBookName()+"\t"+bb.getPress()+"\t"+bb.getPrice()
			+"\t"+bb.getAmount()+"\t"+bb.getMoney());
		}

	}
}
