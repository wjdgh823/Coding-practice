package CodeUp_1028_1099;

import java.util.Arrays;
import java.util.Scanner;

public class codeup_1095 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 23 + 1);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		Arrays.sort(arr);
		
		System.out.print(arr[0]);
		
		
	}

}
