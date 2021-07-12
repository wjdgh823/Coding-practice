package CodeUp_1028_1099;

import java.util.Scanner;

public class codeup_1083 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num =sc.nextInt();
		if (num > 9) {
			System.out.println("1~9까지만 입력해라.");
			return;
		}
		
		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0) {
				System.out.print("X ");
				continue;
			}
			System.out.print(i + " ");
		}
		
		
	}

}
