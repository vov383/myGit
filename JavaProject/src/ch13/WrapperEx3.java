package ch13;
//01-02 과제2
public class WrapperEx3 {

	public static void main(String[] args) {
		String str = "Hello 1234";
		
		Character[] crr = new Character[str.length()];
		for (int i = 0; i < crr.length; i++) {
			crr[i] = str.charAt(i);
		}
		
		for (int i = 0; i < crr.length; i++) {
			if(Character.isUpperCase(crr[i])) {
				System.out.println(crr[i]+"는 대문자입니다.");
				
			}else if(Character.isLowerCase(crr[i])){
				System.out.println(crr[i]+"는 소문자입니다.");
			}else if(Character.isDigit(crr[i])){
				System.out.println(crr[i]+"는 숫자입니다.");
			}else {
				System.out.println(crr[i]+"는 기타입니다.");
			}
		}
		System.out.println("----------------------");
		System.out.println("(Integer사용)");
		String str2 = str.substring(6);
		System.out.println("문자 "+str2+"입니다.");
		System.out.println("숫자 "+Integer.parseInt(str2)+"입니다.");
		System.out.println("숫자 "+2+" + "+Integer.parseInt(str2)+" = " +(Integer.parseInt(str2)+2)+ "입니다.");
	}
}
