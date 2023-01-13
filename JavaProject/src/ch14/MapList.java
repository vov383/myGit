package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {
//Student를 재활용
	static void print(Map<String, Object> map) {//매개변수로 Map타입을
//		@SuppressWarnings("unchecked")//@제너릭을 쓸 때 타입 안정성의 문제 발생. 얘는 써도 되고 안 써도 되고... 오늘은 스리슬쩍 넘어갔네
		ArrayList<Student> list2 = (ArrayList<Student>)map.get("list");//형변환을 해보자
		for(Student s : list2) {
			System.out.println(s.getNum()+"\t"+s.getName()
			+"\t"+s.getMajor()+"\t"+s.getYear()+"\t"+s.getProfessor());
		}
	}
	
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();//맵 인스턴스
		List<Student> list = new ArrayList<>();
		list.add(new Student("202301", "홍길동", "전산", 1, "박교수"));
		list.add(new Student("202302", "이순신", "수영", 2, "선교수"));
		list.add(new Student("202303", "강감찬", "승마", 3, "정교수"));
		
		map.put("list", list);//맵에 리스트를 추가한 것. Key에 "list", value에 list
		print(map);//압축파일처럼 list 안의 3개의 객체가 map에 담겨져 print()쪽의 매개변수화되어 값을 넘김
	}
}
