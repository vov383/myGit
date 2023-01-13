package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

//Map 은 원래 HashMap
public class MapExam {
	public static void main(String[] args) {

		//List는 순서대로 저장, Map은 순서 없어
		//Map<Key자료형, value자료형>
		Map<String, String> map = new HashMap<>();
		map.put("한국", "서울");//맵.put(key, value)

		System.out.println(map.get("한국"));
		map.put("일본", "동경");
		map.put("중국", "북경");
		map.put("미국", "워싱턴");
		map.put("태국", "방콕");
		map.put("영국", "런던");

		System.out.println(map);//순서와 관계없이 toString() 출력됨
		String nation = "영국";
		System.out.println(nation+"의 수도는 "+map.get(nation));
		
		
		//이터레이터 사용
		Iterator<String> iterator = map.keySet().iterator();
		while(iterator.hasNext()) {//다음 요소가 있으면 true
			String key = (String)iterator.next();//다음요소 가져오기
			System.out.print("key="+key);
			System.out.println(",value="+map.get(key));
		}
		
		
		System.out.println();
		//만약 ArrayList로 처리한다면?
		List<String> nations = new ArrayList<>();//키
		nations.add("영국");
		nations.add("미국");
		nations.add("일본	");
		nations.add("중국");
		nations.add("태국");
		nations.add("한국");
		
		List<String> city = new ArrayList<>();//벨류
		city.add("런던");
		city.add("워싱턴");
		city.add("동경");
		city.add("북경");
		city.add("방콕");
		city.add("서울");
	
		nation= "영국";
		for (int i = 0; i < nations.size(); i++) {
			if(nations.get(i).equals(nation)) {
				System.out.println(nations.get(i)+"의 수도는 "+city.get(i));
				break;
			}
		
		}
		
		//특색에 따라서 어떤 프레임워크를 사용할지 달라진다.
		//ArrayList는 빈도 가장 많고 HashMap은 그 다음
		//ArrayList 안에 HashMap 쓸 수도 있고
	
	}	
}
