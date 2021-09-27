package CodeUp_Random;

import java.util.Scanner;

public class codeup_1280 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = 0;
		
		for (int i = a; i <= b; i++) {
			if (i % 2 == 0) {
				result -= i;
			} else if (i % 2 != 0) {
				result += i;
			}
		}
		
		System.out.println(result);
		 
	}

}
