package Quiz_1차원배열;

import java.util.Scanner;

public class Quiz_1차원_기초3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] num = new int[n];
		
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}
		
		int min = 23;
		for (int i = 0; i < n; i++) {
			if (min > num[i] ) {
				min = num[i];
			}
		}
		System.out.println(min);
		
	}

}
