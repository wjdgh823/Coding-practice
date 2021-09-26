package CodeUp_Random;

import java.util.Scanner;

public class codeup_1277 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if (N % 2 == 0) {
			System.out.println("홀수만 입력이 가능합니다.");
			return;
		}
		
		int[] arrN = new int[N];
		
		for(int i = 0; i < arrN.length; i++) {
			arrN[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arrN.length; i++) {
			if (i == 0) {
				System.out.print(arrN[i] + " ");
			} else if (i == arrN.length / 2) {
				System.out.print(arrN[i] + " ");
			} else if (i == arrN.length-1) {
				System.out.print(arrN[i]);
			}
		}
		
		
	}

}
