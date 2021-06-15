package Quiz_2차원배열;

import java.util.Scanner;

public class Quiz_2차원_09 {
	
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int[][] arr = new int[100][100];
		int n = 1;
		
		for (int i = 1; i <= num1; i++ ) {
			for (int j = 1; j <= num2; j++) {
				arr[i][j] = n;
				n++;
			}
		}
		
		for (int i = num1; i >= 1; i-- ) {
			for (int j = 1; j <= num2; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
