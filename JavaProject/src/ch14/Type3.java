package ch14;

public class Type3<T> {//자료형 아직 미정인 상태<아무문자> => <>제너릭 기호

	T t;//변수도 자료형 미정
	public Type3() {//생성자처리 하고자 한다면 <T>빼고 처리
	
	}

	public Type3(T a) {//생성자 매개변수 쓸 때 데이터 타입은 위에서 정한 T로 처리
		t=a;
	}
	
	public void setT(T t) {//메서드도 생성자 매개변수처리와 같음
		this.t = t;
	}

	public T getT() {//미정의 T 타입의 t를 리턴함 --> 어디서 T 정의? 얘를 호출하는 곳에서
		return t;
	}


	public static void main(String[] args) {
		Type3<String> t = new Type3<String>();//인스턴스 생성할 때 T의 자료형 결정. ==> 제너릭!! (일반화)
		t.setT("Hello");
		System.out.println(t.getT());
		
		Type3<Integer> t2 = new Type3<>();//제너릭에서 Wrapper class 사용 //우변은 데이터타입 생략 가능
		t2.setT(100);
		System.out.println(t2.getT());
		
		Type3<Double> t3 = new Type3<Double>(200.5);//생성자 매개변수 활용
		System.out.println(t3.getT());
		
		//주의
		Type3 t4 = new Type3();
		//일반 객체생성? 에러는 아닌데 주의!
		//실행은 되는데 내부적으로 Object 처리함. 메모리 낭비 심해.
		//제너릭에 맞게 처리하자
		t4.setT(100.5);
		System.out.println(t4.getT());
		t4.setT("Java");
		System.out.println(t4.getT());
		
		
	}
}
