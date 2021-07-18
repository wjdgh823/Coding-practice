package CodeUp_1028_1099;

import java.util.Scanner;

public class codeup_1090 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int r = sc.nextInt();
		int n = sc.nextInt();
		
		int cnt = 0;
		for (int i = a; i < 1000000; i *= r) {
			cnt++;
			if (cnt == n) {
				System.out.println(i);
			}
		}
		
	}

}
