package ch14;

import java.util.Vector;

public class VectorExam {

	public static void main(String[] args) {
		//Vector v = new Vector();//에러는 아니지만 아래처럼 처리해야
		Vector<Object> v = new Vector<Object>();
		//데이터 타입을 Object로 했어. 모든 자료형 처리 가능
		System.out.println("초기사이즈 : "+v.capacity());//capacity() : 사이즈 길이값 리턴
		//벡터는 기본적으로 10개의 사이즈 만들어 놓음. 
		v.add("firts");//add("추가할 자료")
		v.add(2);
		v.add(3.5);
		v.add(true);
		v.add(100);
		v.add(101);
		v.add(103);
		v.add(104);
		v.add(105);
		v.add(106);
		v.add(107);
		System.out.println("중간사이즈 : "+v.capacity());
		//입력된 데이터가 초기 10개 사이즈 넘기면 자동으로 사이즈 늘어나
		System.out.println("데이터의 개수 : "+v.size());//Array의 length() 역할
		System.out.println("초기 데이터");
		for (int i = 0; i < v.size(); i++) {
			System.out.print(v.get(i)+"\t");//Vector에서 꺼낼 때 **get()** 활용 //**배열처럼 [i] 배열첨자 쓰면 안된다.
		}
		
		System.out.println();
		//데이터 추가는 파라메터 2개짜리 add(index, value);
		v.add(6, 102);//6번째 index에 데이터 102를 추가
		//지우려면?
		v.remove(0);//요소 삭제 remove();
		for (int i = 0; i < v.size(); i++) {
			System.out.print(v.get(i)+"\t");
		}
		
		
		//Vector는 배열인데 다양한 자료형 넣을 수 있고
		
	}
}
