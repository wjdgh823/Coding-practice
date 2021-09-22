package CodeUp_Random;

import java.util.Scanner;

public class codeup_1272 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		int[] arr = new int[10000000];
		int cnt = 1;
		for (int i = 1; i < arr.length; i+=2) {
			arr[i] = cnt++;
		}
		
		cnt = 10;
		for (int i = 2; i < arr.length; i+=2) {
			arr[i] = cnt;
			cnt+=10;
		}
		
		
		int k = sc.nextInt();
		int h = sc.nextInt();
		
		System.out.println(arr[k] + arr[h]);
		
	}

}
