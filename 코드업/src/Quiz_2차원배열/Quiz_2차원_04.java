package Quiz_2차원배열;

import java.util.Scanner;

public class Quiz_2차원_04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[][]arr = new int[100][100];
		int a = 1;
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num; j++) {
				arr[i][j] = a++;
			}
		}
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
