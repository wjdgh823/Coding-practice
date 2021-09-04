package CodeUp_Random;

import java.util.Scanner;

public class codeup_1226 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		int correct = 0;
		int bonus_correct = 0;
		int n;
		
		for (int i = 0; i < 7; i++) {
			arr[i] = (int)(Math.random()*10);
			System.out.print(arr[i] + " ");
		}
		
		
		for (int i = 0; i < 6; i++ ) {
			n = sc.nextInt();
			for (int j = 0; j < 7; j++ ) {
				if (arr[j] == n) {
					if (j==6) {
						bonus_correct++;
					} else {
						correct++;
					}
				}
			}
		}
		
		if (correct <= 2) {
			System.out.println("꽝");
		} else if (correct == 3) {
			System.out.println("5등");
		} else if (correct == 4) {
			System.out.println("4등");
		} else if (correct == 5&&bonus_correct==0) {
			System.out.println("3등");
		} else if (correct == 5&&bonus_correct==1) {
			System.out.println("2등");
		}  else if(correct == 6) {
			System.out.println("1등");
		}
		
	}

}
