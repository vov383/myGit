package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListStudent {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student("2023001", "김철수", "국사", 1, "박교수"));
		list.add(new Student("2023002", "홍길동", "정치", 2, "최교수"));
		list.add(new Student("2023003", "이순신", "체육", 3, "원교수"));
		System.out.println("학번\t이름\t전공\t학년\t지도교수");
		
//		for (int i = 0; i < list.size(); i++) {
//			Student s = list.get(i);
//			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+s.getMajor()
//			+"\t"+s.getYear()+"\t"+s.getProfessor());
//		}
		//객체를 담아서 출력할 때는 for each()로 출력하는 것이 일반적이다.
		for (Student ss : list) {//개별변수 : 집합변수
			System.out.println(ss.getNum()+"\t"+ss.getName()+"\t"+ss.getMajor()
			+"\t"+ss.getYear()+"\t"+ss.getProfessor());
		}
		//for~each() 쓸 때는 list.get(i)등의 처리 안해주어도 됨. 자동으로 전체변수를 순회해준다. 
	
	}
}
