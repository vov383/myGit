package ch04;
/*
 * if else문을 switch case문으로 바꿀 수 있다.
 * case문을 break까지 한줄에 쓸 수 있다.
 * switch문의 (key)에 들어가는 value는 int만 가능. 
 * 그래서 double형인 avg를 int 로 다운캐스팅
 * printf() 출력하기 *****중요**** 포맷명시자 유의 int double char String
 * 포맷명시자 실수형은 %f
 * 			실수형 출력할 때 소수점 이하 1자리로 출력하기. %.1f
 * 			String형은 %s
 * Math.round((key*100)/100.0)으로 소수점 이하 2자리까지만 자를 수 있다.
 * 
 */
public class Switch_Point {
	public static void main(String[] args) {
		int kor = 85;
		int mat = 90;
		int eng = 70;
		int tot = kor+mat+eng;
		double avg = tot/3.0;
		String grade ="등급";
		
		
		switch ((int)(avg / 10)) { //switch문에 key는 정수만 가능. 형변환 해야해. //double을 int로 변환
			case 10:
			case 9: grade = "수"; break;
			case 8: grade = "우"; break;
			case 7: grade = "미"; break;
			case 6: grade = "양"; break;
			default: grade = "가";
		}
		
		
		
		//결과 출력
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		
		avg = Math.round((avg*100)/100.0);
		/*
		 * 소수점 둘째자리 까지만 자르고 싶다면 
		 * Math함수의 매개변수 안에 100을 곱하고 그 값을 다시 100.0으로 나눈다. 
		 * 100.0인 이유는 Math함수가 long으로 return 받기 때문에 
		 * 실수형으로 만들어 주기 위해 100.0으로 나눈다.
		 * 
		 * String.format으로 소수점을 자르면 자동 반올림이 되기 때문에 주심해아한다.
		 */
		System.out.println(kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg+"\t"+grade);
		System.out.printf("%d\t%d\t%d\t%d\t%.1f\t%s\n",kor, eng, mat, tot, avg, grade); 
		// printf() 가 아직도 헷갈리네 
		//printf() 포맷 명시자 실수형은 %f ,문자열은 %s
	}
}
