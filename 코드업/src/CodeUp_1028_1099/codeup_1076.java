package CodeUp_1028_1099;

import java.util.Scanner;

public class codeup_1076 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		char alpa = sc.next().charAt(0);
		
		int i = 0;
		char result;
		while(true) {
			result = (char) ('a' + i);
			i++;
			if (result == 'f') {
				System.out.print(result + " ");
				break;
			}
			System.out.print(result + " ");
		}
		
		
		
	}

}
