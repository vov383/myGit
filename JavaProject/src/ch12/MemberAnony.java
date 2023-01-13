package ch12;
//12-30 과제1

public class MemberAnony {
	
	public static void main(String[] args) {
		
		Member m = new Member() {
			
			@Override
			public void print(int num, String name, String email) {
				System.out.println("고객번호 : "+num);
				System.out.println("이름 : "+name);
				System.out.println("이메일 : "+email);
			}

			@Override
			public void print() {
				
			}
		};
		m.print(2, "홍길동", "hong@gmail.com");
	}
}