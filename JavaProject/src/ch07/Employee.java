package ch07;

public class Employee {

	private String name;
	private	String part; //부서
	private	String position; //직위
	private	int basic; //기본급
	private	int	bonus; //보너스(기본급의 300%)
	private	int total; //총액(기본급+보너스)
	private int tax; //총액의 3.3%
	private int salary; //실수령액(총액-세액)
	
	
	//일반 메서드로 입력 받아서 처리하자.
	//일일이 타이핑하기 귀찮을 때 생성자 활용해서 처리
	public void input(String name, String part, String position, int basic) {
		this.name = name;
		this.part = part;
		this.position = position;
		this.basic = basic;
		this.bonus = bonus;
		this.total = total;
		this.tax = tax;
		this.salary = salary;
	}
	
	public void calc() {
		bonus = basic*3; //보너스는 기본급의 300%
		total = basic+ bonus;
		tax = (int)(total * 0.033); //실수를 좌변의 int형에 맞추기 위해서 캐스팅
		salary = total - tax;
	}
	
	public void print() {
		System.out.println("이름\t부서\t직위\t기본급\t보너스\t총액\t세액\t실수령액");
		System.out.println(name+"\t"+part+"\t"+position+"\t"+basic+"\t"
		+bonus+"\t"+total+"\t"+tax+"\t"+salary);
	}
	
}
