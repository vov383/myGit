package ch07;
//12-21 과제3
public class Person {
	//멤버변수. 해당 클래스의 멤버.
	private String name;
	private int age;
	private String email;
	private String address;
	private double height;
	
	public void print2() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("이메일 : " + email);
		System.out.println("주소 : " + address);
		System.out.println();
	}
	
	public void print() {
		System.out.println("이름 : " + name +", 나이 : "+age+", 키 : "+height);
	}
	
	//setter : set + 변수명 //창고직원을 만들어서 금고에 데이터에 접근할 수
	public void setName(String name) { //지역변수
		//멤버변수와 지역변수가 이름이 같아. 헷갈리지 않도록 하기 위해서
		this.name = name; //꼬리표를 달아줘. 좌항이 멤버변수. 우항이 지역변수. 
		//this => 멤버변수 가리킴.
	}
	//getter : get + 변수명
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		if(age< 0 || age > 150) {
			System.out.println("입력값이 정확하지 않습니다.");
		}else {
			this.age = age;
		}
	}
	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}	
}