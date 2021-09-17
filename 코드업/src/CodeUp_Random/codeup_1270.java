package CodeUp_Random;

import java.util.Scanner;

public class codeup_1270 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt = 0;
		
		for (int i = 1; i <= n; i++) {
				if (Integer.toString(i).charAt(Integer.toString(i).length()-1) == '1') {
					cnt++;
				}
		}
		
		System.out.println(cnt);
	}
}
