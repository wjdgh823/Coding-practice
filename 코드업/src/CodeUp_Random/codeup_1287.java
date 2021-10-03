package CodeUp_Random;

import java.util.Scanner;

public class codeup_1287 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			for (int j = 0; j < i*n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
