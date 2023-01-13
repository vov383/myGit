package ch13;

import java.util.Calendar;
import java.util.Date;

public class Cal {

	public static void main(String[] args) {
		
		//캘린더 인스턴스 생성은 new로 만들 수 없음
		Calendar cal = Calendar.getInstance(); //시스템 시간값 가져오기
		System.out.println(cal.get(Calendar.YEAR));//상수값으로 해당연도 리턴
		System.out.println(cal.get(Calendar.MONTH)+1);//+1 더해야. 0~11 리턴하기 때문에
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR));//12시간제
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));//24시간제
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		
		//오전 0, 오후 1 리턴
		System.out.println(cal.get(Calendar.AM_PM));
		if(cal.get(Calendar.AM_PM)==0) {
			System.out.println("오전");
		}else {
			System.out.println("오후");
		}
		
		//오늘이 1년 중에 몇번째 날이냐?
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		//월 중에 몇번째 날?
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		//요일(일요일 1 ~ 토요일 7) - java에서는 숫자코드만 제공한다.
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		String yoil="";
		
		switch(cal.get(Calendar.DAY_OF_WEEK)){
		case 1 : yoil = "일요일"; break;
		case 2 : yoil = "웡요일"; break;
		case 3 : yoil = "화요일"; break;
		case 4 : yoil = "수요일"; break;
		case 5 : yoil = "목요일"; break;
		case 6 : yoil = "금요일"; break;
		case 7 : yoil = "토요일"; break;
		}
		System.out.println("오늘은 "+yoil+"이다.");
		
		
		//1년 중 몇번째 주?
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
		
		
		Date date = cal.getTime();
		System.out.println(date.getYear()+1900);//+1900 해주어야.
		//줄이 그어졌다. 왜? 가급적 이 메서드 쓰지 마라. 
		//The method getYear() from the type Date is deprecated //사용을 자제해라. 에러는 안남
		
		System.out.println(date.getMonth()+1);//+1 해주어야 
		System.out.println(date.getDate()); 
		
		//Date 객체는 web에서 사용. 어디에? java와 oracle의 date가 type이 안 맞아서.
		
	}
}
