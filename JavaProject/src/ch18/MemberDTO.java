package ch18;

import java.io.Serializable;

/*
객체 직렬화 하려면 interface Serializable 를 구현해야함
객체 직렬화는 메모리에 저장된 객체를 파일로 저장하거나 네트워크로 전송할 때  

MVC 패턴에서 쓰이는 용어
1) DTO : Data Transfer Object (데이터를 전달하는 객체, 결과물을 저장)
2) VO : Value Object, DTO의 개념이지만 생성자 없이 getter setter로만 구성됨
3) DAO : Data Access Object (데이터 조작 객체, DB와 연결해서 데이터를 구하는, 또 다른 말로 비지니스 로직 단)

*/
public class MemberDTO implements Serializable{

	private String userId;
	private String name;
	private String passwd;
	private int age;
	private String email;
	
	//생성자
	public MemberDTO() {

	}
	public MemberDTO(String userId, String name, String passwd, int age, String email) {
		super();
		this.userId = userId;
		this.name = name;
		this.passwd = passwd;
		this.age = age;
		this.email = email;
	}
	
	//getter setter
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "MemberDTO [userId=" + userId + ", name=" + name + ", passwd=" + passwd + ", age=" + age + ", email="
				+ email + "]";
	}
	
	
	
}
