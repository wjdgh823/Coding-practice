package CodeUp_Random;

import java.util.Scanner;

public class codeup_1230 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int carHeight = 170;
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (carHeight < a) {
			System.out.println("PASS");
		} else {
			System.out.println("CRASH " + a);
			return;
		}
		if (carHeight < b) {
			System.out.println("PASS");
		} else {
			System.out.println("CRASH " + b);
			return;
		}
		if (carHeight < c) {
			System.out.println("PASS");
		} else {
			System.out.println("CRASH " + c);
			return;
		}
		
		
		
		
		
	}

}
