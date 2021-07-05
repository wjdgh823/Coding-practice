package CodeUp_1028_1099;

import java.util.Scanner;

public class codeup_1072 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int val = 0;
		while (true) {
			if (val == num) {
				break;
			}
			val++;
			System.out.println(val);
		}
		
	}

}
