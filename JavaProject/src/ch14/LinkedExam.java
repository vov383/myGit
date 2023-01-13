package ch14;

import java.util.LinkedList;

//링크드 리스트는 잘 안 씀.
//Que 구조 갖고 있어. Que 특징을 잘 챙겨가자
public class LinkedExam {
	public static void main(String[] args) {
		//큐구조 : FIFO. 터널 구조
		String[] fruits = {"사과","배","포도","딸기","수박"};
		
		LinkedList<String> list = new LinkedList<>();
		//for each()로 넣기
		for(String str : fruits) {
			list.offer(str);//Que에 자료 입력 **offer()**		//이런게 정처기 기출문제
		}
		String str="";
		while((str=(String)list.poll()) != null) {//자료 출력 **poll()**
			//자료형 타입 맞추어야. poll()은 리턴 타입 미정(E)이기 때문에 캐스팅 필요!! (String)처럼
			//poll()한 값을 str에 대입하는데, str은 boolean이 아니야. 그래서 전체로 묶어줘야 한다.
			System.out.println(str + "삭제되었습니다.");
		}
		
	}
}
