package CodeUp_1028_1099;

import java.util.Scanner;

public class codeup_1089 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String[] numList = sc.nextLine().split(" ");
		
		int a = Integer.parseInt(numList[0]);
		int b = Integer.parseInt(numList[1]);
		int c = Integer.parseInt(numList[2]);
		
		int cnt = 0;
		while(cnt != c-1) {
			a += b;
			cnt += 1;
		}
		System.out.println(a);
		
	}

}
