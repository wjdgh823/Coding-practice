package CodeUp_Random;

import java.util.Scanner;

public class codeup_1274 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] arr = new int[num];
		int cnt = 0;
		int arrcnt = 0;
		
		for (int i = 1 ; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (i * j == num) {
					arr[cnt] = i;
					arr[cnt++] = j;
				}
			}
		}
		
		for (int i = 0 ; i < arr.length; i++) {
			if (arr[i] != 0) {
				arrcnt++;
			}
		}
		if (arrcnt == 2) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
	
	}
}
