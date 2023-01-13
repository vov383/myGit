package ch13;
//0102 과제1
public class StrBuildEx {

	public static void main(String[] args) {
		
		StringBuilder str1 = new StringBuilder("I am a");
		String str2 = " Java Programmer";
		
		System.out.println(str1.append(str2));
		String str3 = str1.toString();//StringBuilder type을 str3에 저장
		
//		System.out.println(str1.replace(7, 11,"JSP"));
		System.out.println(str3.replace("Java", "JSP"));
		
		System.out.println(str1.substring(7));
//		System.out.println(str3.substring(7));
	}
}
