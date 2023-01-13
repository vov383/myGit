package ch06;

public class SalaryEx {

	static String[] name = {"박과장", "김과장", "이대리", "최주임", "홍실장"}; //클래스 바로 밑에 변수 처리. 
				//배열참조변수면서 동시에 전역변수(멤버변수). 어디에서나 사용되어지며 값들이 기억되어진다.
	static int[] salary = {2800, 3000, 2500, 2000, 3500}; //연봉
	static int[] bonus = {0,0,0,0,0}; //모두 0으로 초기화
	static int[] total = new int[5]; //총액(연봉+보너스) 5칸 배열 잡아놓음.
	static int[] tax = new int[5]; //세금처리
	static int[] pay = new int[5]; //실수령액.
	static int pay_tot; //회사입장 총지급액
	
	static void calc() {
		for (int i = 0; i < name.length; i++) {
			bonus[i] = (int)(salary[i]*0.3); //연봉의 30% 보너스 처리. //int 형으로 형변환. 좌변에 데이터 타입 맞춰
			total[i] = salary[i]+bonus[i];
			tax[i] = (int)(total[i] * 0.03); //세금(총액의 3%)
			pay[i] = total[i]-tax[i]; //실수령액
			pay_tot += pay[i]; //누적 => 지급총액
		}
	} //calc() 안에서 계산 마무리.
	
	static void print() { //출력 용도
		System.out.println("이름\t연봉\t보너스\t총액\t세금\t실수령액");
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]+"\t"+salary[i]+"\t"+bonus[i]+"\t"+total[i]+"\t"+tax[i]+"\t"+pay[i]);
		}
		System.out.println("총 지급액 합계 : "+pay_tot);
		System.out.println("총 지급액 평균 : "+pay_tot/name.length);
	}

	public static void main(String[] args) {
		//코딩의 방향성. 최대한 main()의 코딩량을 줄여.
		//나머지를 전부 메서드화 해서 모듈화 => 호출만 하도록
		calc(); //계산 호출
		print(); //프린트 호출
	}
}
