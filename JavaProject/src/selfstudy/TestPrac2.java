package selfstudy;

public class TestPrac2 {

	public static void main(String[] args) {
		int i=1;
		while(i<=20) {
			if(i%5==0) {
				System.out.println(i);
			}else {}
			i++;
		}
		System.out.println("======");
		
		//while문을 for문으로 //if문을 switch문으로
		for (int j = 1; j <= 20; j++) {
			switch(j%5) {
			case 0:
				System.out.println(j);
			default :
			}
		}
	}
}
