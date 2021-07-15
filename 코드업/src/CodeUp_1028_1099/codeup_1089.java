package CodeUp_1028_1099;

import java.util.Scanner;

public class codeup_1089 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		
		int total = 0;
		int cnt = 0;
		while(true) {
			cnt++;
			if (cnt == 1) {
				total += (num1 + num2);
			} else if (cnt != 1) {
				total += (total + num2);
			}
			
			if (cnt == num3) {
				System.out.println(total);
				return;
			}
		}
		
	}

}
