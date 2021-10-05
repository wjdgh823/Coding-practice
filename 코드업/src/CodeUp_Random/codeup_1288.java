package CodeUp_Random;

import java.util.Scanner;

public class codeup_1288 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int r = sc.nextInt();
		
		int result = makeFactory(n) / (makeFactory(r) * makeFactory(n-r));
		
		System.out.println(result);
				
				
		}
				
	
		public static int makeFactory(int num) {
			int sum = 1;
			for(int i = 1; i <= num; i++) {
				sum *= i;
			}
			return sum;
		}
		

}