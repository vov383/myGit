package ch05;
/*
그동안 했던 점수 처리를 2차원 배열로
 */
public class Array2Point {

	public static void main(String[] args) {
//		5행 5열 
		int[][] point = {{80,90,100,0,0}, {70,60,95,0,0}, {88,77,66,0,0}
		, {99,89,95,0,0}, {100,06,50,0,0}}; //길어지면 Enter
	
		
		//for문으로 점수 처리하기. 이거 이해 안 되면 직접 [0][0]부터 [4][4]까지 뭐가 들어갈지 한번 쭉 적어봐
		//직접 하나하나 타이핑 하다보면 패턴이 들어온다. 그러면 소화 된다. 
//		int point[][];
//		point= new int[5][5]; 
//		point[0][0]=80;
//		point[0][1]=90;
//		point[0][2]=100;
//		point[0][3]=0;
//		point[0][4]=0;
//		point[1][0]=70;
//		point[1][1]=60;
//		point[1][2]=95;
//		point[1][3]=0;
//		point[1][4]=0;
//		point[2][0]=88;
//		point[2][1]=77;
//		point[2][2]=66;
//		point[2][3]=0;
//		point[2][4]=0;
//		point[3][0]=99;
//		point[3][1]=89;
//		point[3][2]=95;
//		point[3][3]=0;
//		point[3][4]=0;
//		point[4][0]=100;
//		point[4][1]=06;
//		point[4][2]=50;
//		point[4][3]=0;
//		point[4][4]=0;
		
		
		for(int i=0; i<point.length; i++) {
			point[i][3]=point[i][0]+point[i][1]+point[0][2]; //total을 이렇게 처리할 수 있다. 
			point[i][4]=point[i][3]/3; //avg도 이렇게 처리.
		}
		System.out.println("국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<point.length; i++) {
			System.out.println(point[i][0]+"\t"+point[i][1]+"\t"+point[i][2]
					+"\t"+point[i][3]+"\t"+point[i][4]);
		}
	}
}
