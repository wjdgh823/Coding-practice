package Quiz_array;

import java.util.Scanner;

public class array_05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [] nums = new int[n];
		
		Double max = 0.0;
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
			if (nums[i] > max) {
				max =(double) nums[i];
			}
		}
		
		Double [] result = new Double[n];
		Double sum = 0.0;
		for (int i = 0; i < nums.length; i++) {
			result[i] = (double)((nums[i] / max)*100);
			sum += result[i];
		}
		
		System.out.println(sum / nums.length);
		
	}

}
