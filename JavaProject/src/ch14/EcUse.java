package ch14;
//01-04 과제1
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EcUse {
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();//HashMap<key : String, value : Object> 
		List<EC> list = new ArrayList<>();
		
		list.add(new EC(1234, "2023-01-04", "하이트맥주", "삼성", "37918797968", 55900));
		list.add(new EC(2345, "2022-12-12", "꼬깔콘", "롯데", "35691697445", 23600));
		list.add(new EC(3456, "2023-01-01", "노트북", "현대", "36160158882", 2600000));
		
		map.put("list", list);//key는 String "list" 고 value는 ArrayList를 집어넣음
		print(map);//출력
		
	}
	static void print(Map<String, Object> map) {//Map 타입의 map을 parameter로 던져
		ArrayList<EC> list2 = (ArrayList<EC>)map.get("list");
		//
		System.out.println("-----------------------------------------------------------------");
		System.out.println("주문번호\t주문일자\t\t주문상품\t카드명\t카드번호\t\t결제금액");
		System.out.println("-----------------------------------------------------------------");
		for (EC s : list2) {
			System.out.println(s.getNo()+"\t"+s.getOrderDate()+"\t"+s.getProduct()
			+"\t"+s.getCardName()+"\t"+s.getCardNo()+"\t"+s.getPay());
			//카드번호 **** 처리 + pay에 ,찍기
		}
		System.out.println("-----------------------------------------------------------------");
		
		
	}
}
