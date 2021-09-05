package CodeUp_Random;

import java.util.Scanner;

public class codeup_1226 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] lottoArr = new int[7];
		int[] myLottoArr = new int[6];
		
		for (int i = 0; i < lottoArr.length; i++) {
			lottoArr[i] = (int)(Math.random()*10);
			System.out.print(lottoArr[i] + " ");
		}
		System.out.print("로또 번호");
		
		for (int i = 0; i < myLottoArr.length; i++) {
			myLottoArr[i] = sc.nextInt();
			System.out.print(myLottoArr[i] + " ");
		}
		System.out.println("내 로또 번호");
		
		int correct = 0;
		int bonus = 0;
		
		for (int i = 0; i < myLottoArr.length; i++) {
			if (myLottoArr[i] == lottoArr[i]) {
				correct++;
			} else {
				if (lottoArr[6] == myLottoArr[i]) {
					bonus++;
				}
			}
		}
		
		if (correct <= 2) {
			System.out.println("꽝");
		} else if (correct == 3) {
			System.out.println("5등");
		} else if (correct == 4) {
			System.out.println("4등");
		} else if (correct == 5&&bonus==0) {
			System.out.println("3등");
		} else if (correct == 5&&bonus==1) {
			System.out.println("2등");
		} else if (correct == 6) {
			System.out.println("1등");
		}
		
	}

}
