package Quiz_1차원배열;

import java.util.Scanner;

public class Quiz_1차원_거꾸로출력3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] num = new int[n];
		
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}
		
		for (int i = n-1; i >= 0; i--) {
			System.out.print(num[i] + " ");
		}
		
	}

}
