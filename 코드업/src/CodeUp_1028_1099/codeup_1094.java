package CodeUp_1028_1099;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class codeup_1094 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [] arrCall = new int[n];
		
		for (int i = 0; i < arrCall.length; i++) {
			arrCall[i] = (int)(Math.random() * 23 + 1);
			System.out.print(arrCall[i] + " ");
		}
		System.out.println();
		
		for (int i = arrCall.length-1; i >= 0; i--) {
			System.out.print(arrCall[i] + " ");
		}
		
	}

}
