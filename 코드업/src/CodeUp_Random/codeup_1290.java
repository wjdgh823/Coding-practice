package CodeUp_Random;

import java.util.Scanner;

public class codeup_1290 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		
		System.out.println(getNum(n)-1);
		
	}
	
	public static int getNum(int n) {
		int aliquot = 0;
		
		for(int i = 1; i <= n; i++) {
			if (n % i == 0) 
				aliquot++;
			
		}
			return aliquot;
	}
	
}
