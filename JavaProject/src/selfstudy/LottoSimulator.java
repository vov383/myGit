package selfstudy;

import java.util.Scanner;

public class LottoSimulator {
	//로또 시뮬레이터
	/*
	당첨 번호를 랜덤으로 먼저 뽑고 
	유저가 번호를 카드섞기로 랜덤으로 뽑으면서 시도 
	당첨번호를 뽑기 위해 돌리는 것과 와 유저가 번호를 뽑기 위해 돌리는 것의 while 따로 해야함.
	메뉴 1번 숫자직접입력
	메뉴2번 자동입력

	로또번호를 무작위로 뽑앗는데
	내가 몇장이나 사면 1등이 될 수 있을까???

	로또시뮬레이터
	숫자 6개+ 보너스 번호
	-----------------------------------------------------------------------
	Q.1등이 걸릴때까지 총 몇회를 시도하였는가?
	Q.게임이 천원씩이라고 했을때 1등이 당첨되었을때 얼마나 썼는가?
	Q.당첨확률?

	그동안 
	2등,3등,4등,5등 은 몇번 당첨되었는가?
	등수별 총상금, 당첨횟수, 확률=당첨횟수/총시도횟수

	1등 -> 당첨번호 6개 일치
	2등 -> 당첨번호 5개 일치 + 보너스 숫자 일치
	3등 -> 당첨번호 5개 일치 
	4등 -> 당첨번호 4개 일치
	5등 -> 당첨번호 3개 일치
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int menu = 0;
		int re_menu = 0;

		int[] numbers = new int[45]; //1~45 숫자 만들기 배열.

		int[] thisweek_number = new int[6]; //금주 로또 당첨번호 6개.
		int thisweek_bonusNumber; //금주 당첨 보너스 넘버.

		int[] auto_numbers = new int[6];
		int auto_numbers_bonusNumber;

		int wow = 0; //맞은 번호 카운트. 선언 및 초기화.
		int wow_bonus = 0; //보너스 맞은 거.

		long try_count = 0;
		long try_money = 0;

		//상금
		int winner1_price = 1600000000;
		int winner2_price = 56000000; 
		int winner3_price = 1400000; 
		int winner4_price = 50000;
		int winner5_price = 5000;


		//등수 집계
		long winner1_total = 0;
		long winner1_count = 0;

		long winner2_total = 0;
		long winner2_count = 0;

		long winner3_total = 0;
		long winner3_count = 0;

		long winner4_total = 0;
		long winner4_count = 0;

		long winner5_total = 0;
		long winner5_count = 0;


		//확률
		double winner1_odds = 0d;
		double winner2_odds = 0d;
		double winner3_odds = 0d;
		double winner4_odds = 0d;
		double winner5_odds = 0d;
		//변수 선언 끝.

		//1~45 숫자 만들기
		for (int i = 0; i < 45; i++) {
			numbers[i] = i+1;

		}

		while(true) { //금주의 로또당첨번호 뽑기용 카드 섞기.
			for (int i = 0; i < 100; i++) {
				int x = (int)(Math.random()*44+1);
				int y = (int)(Math.random()*44+1);
				int temp;
				temp = numbers[x];
				numbers[x] = numbers[y];
				numbers[y] = temp;
			}

			//금주 로또 당첨번호 가져오기.
			for (int i = 0; i < 6; i++) {
				thisweek_number[i] = numbers[i];
			}
			thisweek_bonusNumber = numbers[7];



			while(true) {
				System.out.println("**********************************");
				System.out.println("**** 로      또      시     뮬     레    이    터 *****");
				System.out.println("*********************************");
				System.out.println("1.수동번호 한번 구매");
				System.out.println("2.1등이 될 때까지 자동번호 구매");
				System.out.println("3.종료");
				System.out.print("메뉴선택 > ");
				menu=Integer.parseInt(sc.nextLine());

				if(menu == 1) {
					System.out.println("자동만 가능합니다. 2번이나 3번을 눌러주세요.");

				}else if (menu ==2) {

					try_count =0;
					while(true){
						try_count++;
						wow=0; //맞은 번호 카운트 선언 및 초기화.
						wow_bonus = 0; //보너스번호 맞은거 카운트 선언 및 초기화

						for (int i = 0; i < 100; i++) {
							int x = (int)(Math.random()*(44-0+1)+0); //이걸 이렇게 하는 이유가 뭘까
							int y = (int)(Math.random()*(44-0+1)+0); //이걸 이렇게 하는 이유가 뭘까
							int temp;
							temp = numbers[x];
							numbers[x] = numbers[y];
							numbers[y] = temp;
						}

						//자동 번호 가져오기.
						for (int i = 0; i < 6; i++) {
							auto_numbers[i] = numbers[i];
						}

						//autonumbers_bonusnumber=numbers[7];
						System.out.print(try_count+" 번째 구입한 로또 : ");
						for (int i = 0; i < 6; i++) {
							System.out.print("("+auto_numbers[i]+")");
						}
						System.out.print("\t");

						//일치하는 숫자 있는지 확인
						for(int i=0; i<6; i++) {
							for (int j = 0; j < 6; j++) {
								if(auto_numbers[i]==thisweek_number[j]) {
									wow = wow+1;
								}
								if(auto_numbers[i]==thisweek_bonusNumber) {
									wow_bonus = 1;
								}
							}

						}
						//일치하는 숫자 있는지 끝
						if(wow==6) {
							System.out.println("1등 당첨!!!!!!!");
							winner1_total += winner1_price;
							winner1_count++;

							break;
						} else if(wow==5) { //2등과 3등 판별
							//당첨번호 5개가 일치하면서 보너스 숫자가 일치.
							if(wow_bonus==1) {
								System.out.println("2등 당첨 !!!!!!!");
								winner2_total += winner2_price;
								winner2_count++;
							}

							System.out.println("3등 당첨!!!");
							winner3_total += winner3_price;
							winner3_count++;
						}else if(wow==4) {
							System.out.println(" 4등 당첨!!");
							winner4_total+=	winner4_price;	
							winner4_count++;
						}else if (wow==3) {
							System.out.println(" 5등 당첨!");
							winner5_total+=	winner5_price;	
							winner5_count++;
						}else {
							System.out.println("꽝 ㅠㅠ");
						}

						System.out.println();

					}
					//자동 1등 당첨 될때까지 시도 끝.

				}else if (menu ==3) {
					System.exit(0);
				}
				break;
			}
			//집계 및 출력
			try_money=try_count*1000; //총 구매금액 = 총시도횟수*1000원

			winner1_odds=winner1_count/(double)try_count;
			winner2_odds=winner2_count/(double)try_count;
			winner3_odds=winner3_count/(double)try_count;
			winner4_odds=winner4_count/(double)try_count;
			winner5_odds=winner5_count/(double)try_count;




			//금주의 로또 당첨 번호 출력
			System.out.println();
			System.out.println("***** 금주의 로또 당첨 번호 *****");
			for(int i=0;i<6;i++) {
				System.out.print("("+thisweek_number[i]+") ");
			}
			System.out.print("\t 보너스 :" + thisweek_bonusNumber);

			System.out.println();
			System.out.println();
			System.out.println("총 구매횟수 : " + try_count);
			System.out.println("총 구매금액 : " + try_money);
			System.out.println();
			System.out.println("1등 당첨 횟수 : " + winner1_count + "\t1등 당첨 누적총상금 : " + winner1_total + "\t당첨 확률 : " + winner1_odds);
			System.out.println("2등 당첨 횟수 : " + winner2_count + "\t2등 당첨 누적총상금 : " + winner2_total + "\t당첨 확률 : " + winner2_odds);
			System.out.println("3등 당첨 횟수 : " + winner3_count + "\t3등 당첨 누적총상금 : " + winner3_total + "\t당첨 확률 : " + winner3_odds);
			System.out.println("4등 당첨 횟수 : " + winner4_count + "\t4등 당첨 누적총상금 : " + winner4_total + "\t당첨 확률 : " + winner4_odds);
			System.out.println("5등 당첨 횟수 : " + winner5_count + "\t5등 당첨 누적총상금 : " + winner5_total + "\t당첨 확률 : " + winner5_odds);

			System.out.println("초기메뉴로 돌아가겠습니까? (1.Y/2.N)");
			re_menu=Integer.parseInt(sc.nextLine());
			if(re_menu==1) {
				continue;
			}
		}

	}
}

