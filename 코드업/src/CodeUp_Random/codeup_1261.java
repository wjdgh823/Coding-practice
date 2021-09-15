package CodeUp_Random;

import java.util.Scanner;

public class codeup_1261 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]  = sc.nextInt();
		}
		
		int[] newArr = new int[10];
		int a = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 5 == 0) {
				newArr[a++] = arr[i];
			}
		}
		
		System.out.println(newArr[0]);
		
	}

}
