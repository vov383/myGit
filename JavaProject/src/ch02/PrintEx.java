package ch02;

public class PrintEx {
	//printf() int double 포맷 명시자 	//개행 \n, %n 	//왼쪽정렬, 오른쪽 정렬 빈자리 채우기
	//콤마 3자리 마다 자동으로			//전체자리수		//문자열 포맷 명시자
	//println(String.format(" ", ))	//printf() 안에 %%(반드시 2개 넣기)

	public static void main(String[] args) {

		int i = 97;
		int d = 3000;
		String s = "java";
		double f = 3.14;
		
		System.out.printf("%d\n", i);
		//포맷 명시자. 정수값은 %d 쓴다. // \n %n 은 줄바꿈 처리.
		System.out.printf("%o\n", i);//8
		System.out.printf("%x\n", i);//
		System.out.printf("%c\n", i);//아스키값.
		
		System.out.printf("%5d\n", d);//5자리 오른쪽 정렬.
		System.out.printf("%-5d\n", d);//5자리 왼쪽 정렬.
		System.out.printf("%05d\n", d);//5자리 오른쪽 정렬.빈자리 0으로 채워.
		System.out.printf("%,d\n", d);//3자리마다 , 자동처리. 활용도 높음.
		System.out.printf("%,7d\n", d);//7은 콤마를 포함한 전체 자리수.
		
		System.out.printf("%s\n", s);//문자열은 %s.
		System.out.printf("%5s\n", s);//5칸 오 정
		System.out.printf("%-5s\n", s);//5칸 왼 정
		System.out.printf("%f\n", f);//0이 뒤에 좀 많이 붙네.
		System.out.printf("%e\n", f);//지수승으로 표현
		System.out.printf("%4.1f\n", f);//전체 자리수 4칸, 소수점이하 1칸
		
		//println에서 format형식 취할 때 	
		//
		System.out.println(String.format("4.1f\n", f));
		System.out.printf("%.1f\n", f);
		System.out.printf("%04.1f\n", f);
		System.out.printf("%-4.1f\n", f);
		
		int a = 3, b=5;
		//%를 표현하고자 할 때에는 a%%b 처럼 % 2개 씀.
		System.out.printf("a%%b=%d\n", a%b);
	}

}
