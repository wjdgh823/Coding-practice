package CodeUp_1028_1099;

import java.util.Scanner;

public class codeup_1073 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		
		int val = num;
		System.out.println(val);
		while(true) {
			if (val == 1) {
				break;
			}
			--val;
			System.out.println(val);
		}
		
	}

}
