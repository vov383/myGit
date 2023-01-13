package ch14;

public class EC {
	private int no;//주문번호

	private String orderDate;//주문일자

	private String product;//주문상품

	private String cardName;//카드명

	private	String cardNo;//카드번호

	private	int pay;//결제금액

	public EC() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EC(int no, String orderDate, String product, String cardName, String cardNo, int pay) {
		super();
		this.no = no;
		this.orderDate = orderDate;
		this.product = product;
		this.cardName = cardName;
		this.cardNo = cardNo;
		this.pay = pay;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getCardNo() {//substring()과 replace로 입력한 카드번호 ****처리
		return cardNo.replace(cardNo.substring(5, 9), "****");
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getPay() {//String.format()으로 ,찍기
		return String.format("%,d" ,pay);
	}

	public void setPay(int pay) {
		this.pay = pay;
	}
	
	
	
}
