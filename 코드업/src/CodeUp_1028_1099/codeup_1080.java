package CodeUp_1028_1099;

import java.util.Scanner;

public class codeup_1080 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int total = 0;
		for (int i = 1; i <= num; i++) {
			total += i;
			if (total >= num) {
				System.out.println(i);
				break;
			}
		}
		
	}

}
