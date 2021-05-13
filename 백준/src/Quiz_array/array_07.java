package Quiz_array;

import java.util.Scanner;

public class array_07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int [] arr;
		
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			int n = sc.nextInt();
			arr = new int[n];
			double sum = 0;
			
			for (int j =0; j < n; j++) {
				int val = sc.nextInt();
				arr[j] = val;
				sum += val;
			}
			
			double m = (sum / n);
			double cnt = 0;
			
			for (int j =0; j < n; j++) {
				if (arr[j] > m) {
					cnt++;
				}
			}
			
			System.out.printf("%.3f%%\n",(cnt/n)*100);
		}
		
	}

}
