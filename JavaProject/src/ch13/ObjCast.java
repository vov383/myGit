package ch13;

public class ObjCast {

	public static void main(String[] args) {
		
		int a = 10;
		Object obj = 20; //부모 타입으로 집어넣어. 가능 but 프로그램 무거워져. 리소스 낭비.
//		a = obj; //에러. a는 int type, obj는 Object type. 큰 타입을 작은 타입으로 넣으려면 캐스팅 필요.
//		a = (int)obj; //가능 but 이것보다
		a = (Integer)obj; //WrapperClass를 쓰자. 객체는 객체끼리 놀아야해.
		System.out.println(a); //정상출력 됨.
		
		Object[] obj2 = {100, 100.5, true, "hello", 'A'}; //Object는 모든 타입 다 담을 수.
		//사실은 각 데이터가 Object 객체(Integer, Double, Boolean... 등)가 되어버린다. (오토박싱 처리)
		//그래서 이렇게 해버리면 메모리 낭비 엄청 심해짐. 이렇게 쓰는 일은 없다.
		
		//대신 컬렉션 처리(ArrayList 등)로 보완. 
		//여러 데이터 타입 담을 수 있고 메모리 낭비 줄임.
		
		for(Object o : obj2) { //Enhanced for()
			System.out.println(o); //(내부적으로 오토 언박싱 처리)
		}
		
	}
}
