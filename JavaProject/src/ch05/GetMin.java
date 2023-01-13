package ch05;
//최소값 얻는 프로그램
public class GetMin {

	public static void main(String[] args) {
		int s[] = {12, 3, 19, 6,18,8,12,4,1,19}; //Syntax error on token } 자리에 ) 를 썼더니... 주의하자.
		int minimuin;
		minimuin = s[0]; //minimuin=12 로 초기화.
		for(int i=1; i<s.length; i++) { //[0]에는 이미 값을 할당 했으니까. 
			if(s[i] < minimuin) { //3<12
				minimuin = s[i]; //minimuin =3 으로 값 변경. 자리를 바꿈.
			}
		}
		System.out.print("최소값은 : " + minimuin);
	}
}
