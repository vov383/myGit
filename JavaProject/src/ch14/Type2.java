package ch14;

public class Type2 {

	private Object value;

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
	public static void main(String[] args) {
		Type2 t = new Type2();
		t.setValue("kim");//Object니까 문자열 아무렇게나 생성할 수 있고
		System.out.println(t.getValue());
		t.setValue(10);//int 도 넣고
		System.out.println(t.getValue());
		t.setValue(100.5);//double 도 넣고
		System.out.println(t.getValue());
		//코드 하나로 다 쓸 수 있어서 편하지만...
		//Object로 모든걸 처리하면 무거워짐. 내부적으로 형변환 거쳐야.
	}
}
