package Quiz_array;

import java.util.Scanner;

public class array_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] nums = new int[9];
		int max = 0;
		int order = 0;
		for (int i = 0; i < 9; i++) {
			nums[i] = sc.nextInt();
			if (nums[i] > max) {
				max = nums[i];
				order = i + 1;
			}
		}
		
		System.out.println("최대값 : " + max + ", 몇번째? " + order);
		
	}

}
