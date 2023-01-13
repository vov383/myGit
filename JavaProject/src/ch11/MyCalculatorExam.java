package ch11;

public class MyCalculatorExam {

	public static void main(String[] args) {
		
		//다형성
		Calculator calc = new MyCalculator();
		int value1 = calc.multiple(5, 10);
		int value2 = calc.plus(5, 10);
		int value3 = calc.exec(5, 10); //부모 메서드 호출.
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3); 
	}
}
