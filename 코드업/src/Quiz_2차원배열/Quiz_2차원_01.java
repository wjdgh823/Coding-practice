package Quiz_2차원배열;

import java.util.Scanner;

public class Quiz_2차원_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[19][19];
		
		int n = sc.nextInt();
		for(int a = 0; a < n; a++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			// 인덱스 개념으로 0으로 받았으니 -1해야한다.
			// 입력받은 x,y에는 횐 돌 표기  = 1
			arr[x-1][y-1] = 1;
		}
		
		for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 19; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
