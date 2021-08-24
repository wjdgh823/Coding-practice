package CodeUp_Random;

import java.util.Scanner;


public class codeup_1180 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String ten = String.valueOf(n / 10);
		String one = String.valueOf(n % 10);
		
		int result = Integer.parseInt(one + ten) * 2;
		
		System.out.println(result);
		if (result <= 50) {
			System.out.println("GOOD");
		} else if (result > 50) {
			System.out.println("OH MY GOD");
		}
		
	}

}
