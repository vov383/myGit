package ch08;

public class Book { //도서판매정보 프로그램(생성자 버전)
	//멤버변수
	private String bookName; //책이름
	private String author; //저자
	private String press; //출판사
	private int year; //출판연도
	private int price; //단가
	private int amount; //판매수량
	private int money; //판매금액(단가*판매수량

	public Book() { //기본생성자 생성 generate constructor from super class 하면 됨. 내용은 지워
		this("자바", "김선생", "한빛", 2020, 25000, 10); 
		//this()로 다른 생성자 호출할 때는 반드시 첫째 줄에서 호출
		//매개변수 개수 잘 맞춰야.
		System.out.println("기본생성자 호출");
	}

	//generate constructor using Field -> super 는 빼버려.
	public Book(String bookName, String author, String press, int year
			, int price,  int amount) {

		System.out.println("매개변수가 있는 생성자 호출");
		this.bookName = bookName;
		this.author = author;
		this.press = press;
		this.year = year;
		this.price = price;
		this.amount = amount;

	}
	public int getMoney() { //계산처리
		money = price*amount;
		return money;
	}
	public void print() {
		System.out.println("도서명\t저자\t출판사\t출판연도\t가격\t판매수량\t판매금액");
		System.out.println(bookName+"\t"+author+"\t"+year+"\t"
				+press+"\t"+price+"\t"+amount+"\t"+getMoney());
	}
}




