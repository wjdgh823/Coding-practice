package Quiz_정렬;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz_데이터정렬small {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		for(int i = 0; i < num; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
