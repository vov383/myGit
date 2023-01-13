package ch13;

public class Replace {

	public static void main(String[] args) {
		
		String a = "java program";
		System.out.println(a.replace("a", "A")); //str.replace("old", "new") 사용해보기
		
		a=a.replace("a", "A"); //replace() 동작원리. a를 바꾼 것 아님
		//내부 동작원리 Arrays.copyOf method로 복사해놓고 늘어날 길이만큼의 char array 를 할당하고, 
		//new String(buf, true) 새로운 String 객체를 생성하고 return
		System.out.println(a);
	}
}
