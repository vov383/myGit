package ch14;
//실무 스타일 맛보기
public class Member {
	private String userId;
	private String passwd;
	private String name;
	private String tel;
	private String email;
	
	//생성자
	public Member() {
		
	}
	public Member(String userId, String passwd, String name, String tel, String email) {
		super();
		this.userId = userId;
		this.passwd = passwd;
		this.name = name;
		this.tel = tel;
		this.email = email;
	}
	
	//getter, setter
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
