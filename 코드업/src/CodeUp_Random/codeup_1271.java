package CodeUp_Random;

import java.util.Scanner;

public class codeup_1271 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr	 = new int[n];
		int max = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length) {
				break;
			} else {
				if (arr[i] > max) {
					max = arr[i];
				}
			}
		}
		
		System.out.println(max);
	}

}
