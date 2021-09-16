package CodeUp_Random;

import java.util.Scanner;

public class codeup_1265 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(n + "x" + i + "=" + n*i);
		}
		
	}

}
