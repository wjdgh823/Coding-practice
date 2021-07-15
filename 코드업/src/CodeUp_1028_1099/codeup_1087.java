package CodeUp_1028_1099;

import java.util.Scanner;

public class codeup_1087 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int plusVal = 0;
		for (int i = 1; i <= num; i++) {
			plusVal += i;
			if (plusVal >= num) {
				System.out.println(plusVal);
				return;
			}
		}
		
	}

}
