package CodeUp_1028_1099;

import java.util.Scanner;

public class codeup_1067 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if (num * -1 > 0) {
			System.out.println("minus");
			if (num % 2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		} else {
			System.out.println("plus");
			if (num*-1 % 2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		}
		
	}

}
