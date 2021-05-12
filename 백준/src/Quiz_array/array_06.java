package Quiz_array;

import java.util.Scanner;

public class array_06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String arr[] = new String[sc.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			int count = 0; //횟수
			int sum = 0;   // 누적합산
			
			for (int j =0; j < arr[i].length(); j++) {
				  
				if (arr[i].charAt(j) == '0') {
					count++;
				} else {
					count = 0;
				}
				
				sum += count;
				
			}
			
			System.out.println(sum);
			
		}
		
	}

}
