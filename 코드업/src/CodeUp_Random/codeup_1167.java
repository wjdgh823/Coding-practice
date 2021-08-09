package CodeUp_Random;

import java.util.Arrays;
import java.util.Scanner;

public class codeup_1167 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			if (i == 1) {
				System.out.println(arr[i]);
			}
		}
		
	}

}
