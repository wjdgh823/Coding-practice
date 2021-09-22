package CodeUp_Random;

import java.util.Arrays;
import java.util.Scanner;

public class codeup_1273 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[100];
		int cnt = 0;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i * j == n) {
					arr[cnt] = i;
					arr[cnt++] = j;
				}
			}
		}
		Arrays.sort(arr);
		
		for(int i : arr) {
			if (i == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		
		
	}

}
