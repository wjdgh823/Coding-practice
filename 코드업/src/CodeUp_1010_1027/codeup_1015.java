package CodeUp_1010_1027;

import java.util.Scanner;

public class codeup_1015 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Float x = sc.nextFloat();
		
		String val = x + "";
		String[] arr = val.split(".");
		
		System.out.println(arr.length);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
		
		
	}

}
