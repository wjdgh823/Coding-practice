package CodeUp_Random;

import java.util.Scanner;

public class codeup_1231 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String formula = sc.next();
		String[] nums = new String[2];
		int calval = 0;
		
		if (formula.contains("+")) {
			nums = formula.split("\\+");
			for (int i = 0 ; i < nums.length; i++) {
				calval += Integer.parseInt(nums[i]);
			}
		} else if (formula.contains("-")) {
			nums = formula.split("-");
			calval = Integer.parseInt(nums[0]) - Integer.parseInt(nums[1]);
		} else if (formula.contains("x")) {
			nums = formula.split("x");
			calval = Integer.parseInt(nums[0]) * Integer.parseInt(nums[1]);
		} else if (formula.contains("/")) {
			nums = formula.split("/");
			calval = Integer.parseInt(nums[0]) / Integer.parseInt(nums[1]);
		}
		System.out.println(calval);
		
	}

}
