package CodeUp_1028_1099;

import java.util.Scanner;

public class codeup_1066 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		String result1 = num1 % 2 == 0 ? "even" : "odd";
		String result2 = num2 % 2 == 0 ? "even" : "odd";
		String result3 = num3 % 2 == 0 ? "even" : "odd";
		
		System.out.println(result1 + " " + result2 + " " + result3);
	}

}
