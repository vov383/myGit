package ch05;
/*
main()에 String 타입의 args가 들어온다.
 */
public class Args {

	public static void main(String[] args) {
		for(int i=0; i<args.length; i++) {
			System.out.println(i+"번째 매개변수 : "+args[i]); //그냥 실행하면 아무것도 안 나와. 값을 넣어줘야함
			//Run 탭에서 run configuration 들어가서 Argument 에 value를 입력하면 나온다.
			//main() 도 문자열을 받아서 배열로 모든 것을 처리한다. 매커니즘에 대한 이해.
			
		}
	}
}
