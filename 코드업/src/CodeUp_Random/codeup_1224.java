package CodeUp_Random;

import java.util.Scanner;

public class codeup_1224 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		double val1 = (double)a/b;
		double val2 = (double)c/d;
		
		if (val1 > val2) {
			System.out.println(">");
		}else if (val1 == val2) {
			System.out.println("=");
		} else if (val1 < val2) {
			System.out.println("<");
		}
		
	}

}
