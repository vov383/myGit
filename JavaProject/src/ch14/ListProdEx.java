package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListProdEx {

	public static void main(String[] args) {
		
		Map<String, Object> map = new HashMap<>();//해쉬맵 객체 생성. //type으로 Object 설정하는건 괜찮음.
		List<ProdEx> list = new ArrayList<>();//리스트 객체 생성
		
		list.add(new ProdEx("TV", "oled123", "LG", 300, 10));//인스턴스마다 다른 메모리에 저장되는중
		list.add(new ProdEx("냉장고", "sm02re", "삼성", 200, 5));
		list.add(new ProdEx("에어컨", "wind03", "위니아", 100, 8));
		list.add(new ProdEx("컴퓨터", "asus01", "아수스", 200, 6));
		
		map.put("list", list);//맵에 리스트를 추가. 압축파일에 압축 파일을 넣은 것. 이중 압축처리와 마찬가지 put(key, value)
		print(map);//parameter에 map 넣어서
		
	}
	
	static void print(Map<String, Object> map) {//Map<String, Object> 이거 자체가 데이터 타입이다.
		ArrayList<ProdEx> list2 = (ArrayList<ProdEx>)map.get("list");
		//타입이 안 맞으면 에러. 좌변이 우변보다 크거나 같아야 
		//==> Object 타입을 ArrayList로 맞춰준다.
		System.out.println("-------------------------(단위:만원)-----------------");
		System.out.println("제품명\t제품번호\t제조사\t단가\t수량\t판매금액");
		System.out.println("---------------------------------------------------");
		for (ProdEx s : list2) {
			System.out.println(s.getName()+"\t"+s.getNum()+"\t"+s.getCompany()
			+"\t"+s.getPrice()+"\t"+s.getAmount()+"\t"+s.getMoney());
		}
		System.out.println("---------------------------------------------------");

		
	}
	
}
