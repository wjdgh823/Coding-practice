package Quiz_정렬;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Quiz_내림차순정렬 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		Integer [] arr = new Integer[num];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		System.out.println(Arrays.toString(arr));
		
	}

}
