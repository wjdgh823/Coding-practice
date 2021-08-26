package CodeUp_Random;

import java.util.Scanner;

public class codeup_1207 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] numArr = new int[4];
		
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = sc.nextInt();
		}
		
		int numCnt = 0;
		for (int i = 0; i < numArr.length; i++) {
			if (numArr[i] == 1) {
				numCnt++;
			}
		}
		
		if(numCnt == 1) {
			System.out.println("도");
		} else if (numCnt == 2) {
			System.out.println("개");
		} else if (numCnt == 3) {
			System.out.println("걸");
		} else if (numCnt == 4) {
			System.out.println("윷");
		} else {
			System.out.println("모");
		}
			
		
	}

}
