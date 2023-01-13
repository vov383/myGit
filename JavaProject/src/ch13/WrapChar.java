package ch13;

public class WrapChar {

	public static void main(String[] args) {
		char[] data = {'J', 'a', 'v', 'a', '1', '#'};//char는 반드시 ''쓸 것.
		for(int i=0; i<data.length; i++) {
			if(Character.isUpperCase(data[i])) {//isUpperCase()대문자면 true 리턴
				System.out.println(data[i]+"==> 대문자");
			}else if(Character.isLowerCase(data[i])) {//isLowerCase() 소문자면 true
				System.out.println(data[i]+"==> 소문자");
			}else if (Character.isDigit(data[i])) {//isDigit() 숫자면 true
				System.out.println(data[i]+"==> 숫자");
			}else {
				System.out.println(data[i]+"기타문자");
			}
		}
	}
}
