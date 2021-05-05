package Quiz_array;

import java.io.IOException;
import java.util.Scanner;

public class array_01 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [] arr = new int[n];
		int min = 10000;
		int max = 0;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr.length);
			
			arr[i] = sc.nextInt();
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("최대숫자 : " + max + ", 최소숫자 : " + min);
	
		
	}

}
