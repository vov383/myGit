package ch04;
//if else 연습. 실행문 5개.
//Math.round() 메서드. 실수형 자료를 반올림 해주고 long type으로 반환한다.
//Math.round(avg*100)/100.0 ==> avg값에 100을 곱한 후에 반올림 한 다음 100.0 으로 나눠 ==> 소수점 둘째자리만 남기고 그 이하는 자를 수 있음
//100.0으로 나누는 이유는 long type을 실수형으로 받기 위해서

public class If_else_Ex2 {
	
	public static void main(String[] args) {
		
		int kor = 85;
		int mat = 90;
		int eng = 70;
		int tot = kor + mat + eng;
		double avg = tot/3.0;
		String grade = ""; //성적을 등급으로 처리하고 싶을 때
		if(avg >=90) {
			grade = "수";
		}else if (avg>=80){
			grade ="우";
		}else if (avg>=70) {
			grade = "미";
		}else if (avg>=60) {
			grade ="양";
		}else {
			grade ="가";
		}
		//결과출력
		avg = Math.round(avg*100)/100.0;
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println(kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg+"\t"+grade);
		System.out.printf("%d\t%d\t%d\t%d\t%.2f\t%s",kor, eng, mat, tot, avg, grade);
		
		
	}
}
