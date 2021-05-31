package Quiz_2차원배열;

import java.util.Scanner;

public class Quiz_2차원_03 {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
    	
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		int a = 1;
		
		for (int i=0; i<n; i++) {
			for (int j=n-1; j>=0; j--) {
				arr[i][j] = a;
				a++;
			}
		}
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}


		
	}

}
