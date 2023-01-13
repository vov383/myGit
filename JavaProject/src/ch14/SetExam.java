package ch14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {

	public static void main(String[] args) {
		
		//Set계열 특징. 중복값 불허
		
		//TreeSet은 정렬해줌.
//		Set<String> hs = new TreeSet<>(); 
		//단 입력과정 중에서 계속 sorting 하기 때문에 대량의 데이터를 다루기엔 비효율적이다.
		
		//실무에서 많이 쓰는 건 hashSet
		Set<String> hs = new HashSet<>();
		hs.add("korea");
		hs.add("japan");
		hs.add("ameria");
		hs.add("britain");
		hs.add("korea");//중복값 넣으면 처리 안해줌
		System.out.println(hs);//순서대로 저장되지 않음
		for(String str : hs) {
			System.out.println(str);
		}
		System.out.println("===============");
		//Iterator 반복처리를 위한 클래스
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {//다음요소가 있으면 true
			System.out.println(it.next());//다음요소를 꺼냄
		}
		
	}
}
