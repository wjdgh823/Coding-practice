package Quiz_1차원배열;

import java.util.Scanner;

public class Quiz_1차원_배열2번출력 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		int [] num = new int[k];
		
		
		
		for (int j = 0; j < k; j++) {
			num[j] = sc.nextInt();
		}
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < k; j++) {
				System.out.println(num[j]);
			}
		}
	
	}

}
