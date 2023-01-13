package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListExam {

	public static void main(String[] args) {
		
//		ArrayList<Object> list = new ArrayList<>();//정석
		List<Object> list = new ArrayList<>();//실무용 코드(다형성 기법)
		list.add("하나");
		list.add(2);
		list.add(5.5);
		list.add(false);
		list.add(2,4);//How 값 추가?? => list.add(index, value)

		list.remove(0);//값 제거 => remove(index)
		
		for (int i = 0; i < list.size(); i++) {//Vector처럼 length가 아니고 size()
			System.out.print(list.get(i)+"\t");
		}
	
	}
}
