package CodeUp_Random;

import java.util.Scanner;

public class codeup_1289 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] ground = new int[6];
		
		for(int i = 0; i < ground.length; i++) {
			ground[i] = sc.nextInt();
		}
		
		int result1 = 1;
		int result2 = 1;
		int result3 = 1;
		
		for (int i = 0; i < ground.length; i++) {
			if (i <= 1) {
				result1 *= ground[i];
			} else if (i <= 3 && i >= 2) {
				result2 *= ground[i];
			} else {
				result3 *= ground[i];
			}
		}
		
		int max = 0;
		
		int[] resultArr = new int[3];
		
		resultArr[0] = result1;
		resultArr[1] = result2;
		resultArr[2] = result3;
		
		for(int i = 0; i < resultArr.length; i++) {
			if(resultArr[i] > max) {
				max = resultArr[i];
			}
		}
		
		System.out.println(max);
	}

}
