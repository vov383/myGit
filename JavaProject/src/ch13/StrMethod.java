package ch13;

public class StrMethod {
	public static void main(String[] args) {

		String str1 = "java";
		str1 += " programming";//문자열 누적, but 문자열은 불변성. 
		//실제로는 새로운 문자열을 만들고 str1이 가리키는 주소값은 계속 바뀐다.
		//'='의 뜻. 좌변의 값을 우변으로 초기화.
		//for문으로 문자열 누적하면 str이 바뀌면서 메모리를 잡아먹는다.
		System.out.println(str1.length());//문자열의 길이값
		
		String str2 = str1.concat(" programmer");//concat()도 문자열 연결시킴
		System.out.println(str2);
		System.out.println(str1);
		System.out.println(str1.charAt(2));//charAt() n번째 문자값 리턴
		System.out.println(str2.indexOf("program"));//"program"문자열을 찾아. 그 시작 문자인 p의 index값을 리턴
		
		System.out.println(str2.indexOf("z"));//내용이 없으면 -1 return(**중요**)
		//나중에 jsp servlet 할 때, url요청이 없을 때 이 -1 리턴을 활용함.
		
		System.out.println(str2.substring(0, 4));//0번부터 n-1번까지. 마지막 불포함.
		System.out.println(str2.substring(5));//5부터 끝까지
		
		System.out.println(str2.replace("java", "jsp"));//java가 있으면 jsp로 replace
		System.out.println(str2);//str2의 문자열은 그대로 유지
		str2 = str2.replace("java", "jsp");//주소값을 바꾸면 바뀜
		System.out.println(str2);
		System.out.println(str2.replace("jso", "king"));//없으면 안바뀌네.
		
		String str3 = "35697058312";
		System.out.println(str3.substring(5,9));
		//replace()와 substring()을 섞어서 써보자
		//문자열 중간을 마킹처리하고싶을 때 이런 기법 사용.
		System.out.println(str3.replace(str3.substring(5, 9), "****"));
		
	}
}
