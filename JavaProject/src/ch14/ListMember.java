package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListMember {
	
	public static void main(String[] args) {
		
		List<Member> list = new ArrayList<>();//제너릭으로 데이터 타입을 Member 집어넣어
		//클래스가 가진 멤버변수가 가진 데이터타입이 기껏해야 String int double 정도?
		//ArrayList<클래스 객체> -<Object> 대신 만들어놓은 Member객체를 제너릭함. 
		//Object보다 메모리 효율 좋고 Member에서 쓰는 타입 다 처리 가능
		
		Member m1 = new Member();
		m1.setName("김철수");
		m1.setUserId("kim");
		m1.setPasswd("1234");
		m1.setTel("010-1234-5678");
		m1.setEmail("kim@gmail.com");
		
		
		//컬렉션에는 객체를 담을 수 있음
		//객체자료를 ArrayList에 담는 방법
		//1)
		list.add(m1);//ArrayList에 Member객체를 하나 추가. 
		System.out.println(list.size());//객체 잘 add()됐나 확인
		
		//2)
		Member m2 = new Member("lee", "2345", "이순신", "010-4321-9876", "lee@naver.com");
		list.add(m2);//ArrayList에 Member객체를 하나 더 추가.
		System.out.println(list.size());
		
		//3)방법
		list.add(new Member("choi", "4321", "최홍만", "010-1111-2222", "choi@nate.com"));//참조변수 없이 바로 new
		System.out.println(list.size());
		
		System.out.println("이름\t아이디\t비번\t전화\t\t이메일");
		for (int i = 0; i < list.size(); i++) {
			//꺼내올 때는 get()
			Member m = list.get(i);//여기서 m은 ArrayList의 각 데이터를 가리킬 임시 참조변수로 활용
			System.out.println(m);//m의 주소값은 다 다름
			System.out.println(m.getName()+"\t"+m.getUserId()+"\t"+m.getPasswd()
			+"\t"+m.getTel()+"\t"+m.getEmail());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
