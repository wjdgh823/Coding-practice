package CodeUp_1028_1099;

import java.util.Scanner;

public class codeup_1045 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.print
		(          (num1 + num2) + "\n"
				+ (num1 - num2) + "\n"
				+ (num1 * num2) + "\n"
				+ (num1 / num2) + "\n"
				+ (num1 % num2) + "\n"
				 + (String.format("%.2f", (double)num1/num2))
		);
		
	}

}
