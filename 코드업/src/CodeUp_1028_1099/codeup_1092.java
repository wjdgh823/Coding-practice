package CodeUp_1028_1099;

import java.util.Scanner;

public class codeup_1092 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int tum1 = sc.nextInt();
		int tum2 = sc.nextInt();
		int tum3 = sc.nextInt();
		
		int day = 1;
		while(tum1 != 0 && tum2 != 0 && tum3 != 0) {
			if (day % tum1 == 0 && day % tum2 == 0 && day % tum3 == 0) break;
				day++;
		}
		System.out.println(day);
	}

}
