package selfstudy;

import java.util.Arrays;

public class LottoAuto {

	public static void main(String[] args) {
		
		System.out.println("로또번호 랜덤 생성");
		int round = 0;
		int lottoNum[] = new int[6]; //6칸 배열 생성.
		
		String result_txt = ""; 
		//왜 멤버변수로 선언했을까 어차피 for문 안에서 쓸거니까 지역변수로 해도 됐을텐데... 결과에 영향 없는듯?
		
		for (int i = 0; i < 30; i++) {
			
			result_txt = "";
			result_txt += round+1+"회 : ["; 
			
			//6개의 번호를 저장.
			for (int j = 0; j <= 5; j++) {
				int num_temp = (int)(Math.random()*44+1);
				lottoNum[j] = num_temp; //번호를 이렇게 0번부터 5번까지 6개 찍는구나.
				
				//Math.random() 얘는 0.0초과 1.0미만 double 값을 반환해. 
				//그 값에 *44해서 +1 하면 1부터 45까지의 랜덤한 정수를 반환하게 되네
			}
			
			//지정된 숫자를 정렬.
			Arrays.sort(lottoNum);
			
			//중복된 값 체크.
			boolean duple = false;
			for (int k = 0; k < lottoNum.length; k++) {
				if(k==lottoNum.length-1) { //6번째 숫자라면
					result_txt += lottoNum[k]+"]";
				}else if(lottoNum[k] != lottoNum[k+1]) { //list 내 숫자 중복 x일 경우.
					result_txt += lottoNum[k]+",\t";
				}else { //숫자 중복이면
					duple = true;
				}
			}
			
			if(round==5) {
				break;
			}
			if(duple==false) { //중복된 숫자 없으면 로또 번호 출력.
				round++;
				System.out.println(result_txt);
			}
		}
		
	}
}
