package CodeUp_1028_1099;

import java.util.Scanner;

public class codeup_1064 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int result1 = num1 < num2 ? num1 : num2;
		
		int result2 = num3 < result1 ? num3 : result1;
		
		System.out.println(result2);
		
	}

}
