package ch14;

public class Type1 {
	private double value;
	private String value2;

	public String getValue2() {
		return value2;
	}

	public void setValue2(String value2) {
		this.value2 = value2;
	}

	public double getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public static void main(String[] args) {
		
		Type1 t = new Type1();
		t.setValue(100);
		System.out.println(t.getValue());
		
	}
	
}
