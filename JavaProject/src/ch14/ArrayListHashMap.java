package ch14;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListHashMap {

	public static void main(String[] args) {
		

		 

//		먼저 ArrayList를 안에  HashMap이 입력 되도록 선언하자.

		ArrayList<HashMap<String, String>> list = new ArrayList<>();

//		이렇게 하면 ArrayList안에 String(key), String(value) 쌍인 HashMap을 집어 넣을 수 있다.

//		이제 HashMap을 두개 생성하고 데이터를 넣어보자.

		HashMap<String, String> personMap1 = new HashMap<String, String>();
		HashMap<String, String> personMap2 = new HashMap<String, String>();
		personMap1.put("이름", "김경태");
		personMap1.put("나이", "28");
		personMap1.put("직업","게이머");

		personMap2.put("이름", "이아영");
		personMap2.put("나이", "28");
		personMap2.put("직업","디자이너");
		
//		이렇게 두개의 HashMap객체를 먼저 만들어 놓았던 ArrayList에 넣어보자. add()
		list.add(personMap1);
		list.add(personMap2);
//		이렇게 하면 ArrayList의 객체 list에 두개의 HashMap이 들어가 있게 된다.

//		이제 빼서 사용해보자..
		HashMap<String, String> takeMap1 = (HashMap<String,String>)list.get(0);
		String name1 = takeMap1.get("이름");
		String age1 = takeMap1.get("나이");
		String job1 = takeMap1.get("직업"); 

		HashMap<String, String> takeMap2 = (HashMap<String,String>)list.get(1);
		String name2 = takeMap2.get("이름");
		String age2 = takeMap2.get("나이");
		String job2 = takeMap2.get("직업"); 
	}
}
