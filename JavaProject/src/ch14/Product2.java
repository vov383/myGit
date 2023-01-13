package ch14;
import java.text.DecimalFormat;
//01-03 과제
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Product2 {

	List<Product2> list = new ArrayList<>();
	private String num;
	private String name;
	private String company;
	private int price;
	private int amount;
	private double pay;
	private double vat = 0.1;//부가세
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("제품번호를 입력하세요(종료는 0) > ");
			String temp=scan.next();
			if(temp.equals("0")) 
				break;
			num = temp;
			System.out.print("제품명을 입력하세요(종료는 0) > ");
			temp = scan.next();
			if(temp.equals("0")) 
				break;
			name = temp;
			System.out.print("제조사를 입력하세요(종료는 0) > ");
			temp = scan.next();
			if(temp.equals("0")) 
				break;
			System.out.print("단가(천원)를 입력하세요(종료는 0) > ");
			temp = scan.next();
			if(temp.equals("0")) 
				break;
			price = Integer.parseInt(temp);
			System.out.print("수량을 입력하세요(종료는 0) > ");
			temp = scan.next();
			if(temp.equals("0")) 
				break;
			amount = Integer.parseInt(temp);
			
			pay = price * amount + vat;
			list.add(new Product2(num, name, company, price, amount, pay));
			}//end while()
			
			scan.close();
			System.out.println("입력 끝");
			
			Map<String, Object> map = new HashMap<>();
			map.put("list", list);
			
			List<Product2> list2 = (ArrayList<Product2>)map.get("list");
			
			System.out.println("========================================================");
			System.out.println("제품번호\t제품명\t제조사\t단가(천원)\t수량\t금액(부가세 포함, 천원)");
			System.out.println("-------------------------------------------------");
			
			for (Product2 pp : list) {//개별변수 : 집합변수
				System.out.println(pp.getNum()+"\t"+pp.getName()+"\t"+pp.getCompany()
				+"\t"+pp.getPrice()+"\t"+pp.getAmount()+"\t"+pp.getPay());
			}
			System.out.println("========================================================");
	}//end input()
	
	public Product2() {

	}
	public Product2(String num, String name, String company, int price, int amount, double pay) {
		this.num = num;
		this.name = name;
		this.company = company;
		this.price = price;
		this.amount = amount;
		this.pay = pay;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getPay() {//부가세 포함 금액
		DecimalFormat df = new DecimalFormat("###,###.#");
		return df.format(price * amount *(1+vat));
	}
	
	public void setPay(int pay) {
		this.pay = pay;
	}





}
