package CodeUp_Random;

import java.util.Scanner;

public class codeup_1284 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		int index = 0;
		int indexcnt = 0;
		for(int i = 1; i <= arr.length; i++) {
			for(int j = 1; j <= arr.length; j++) {
				if (i * j == num) {
					indexcnt++;
					if (indexcnt == 2) {
						arr[index] = i;
						arr[++index] = j;
					}
				}
			}
		}
		
		int[] arr1;
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)	 {
				cnt++;
			}
		}
		
		arr1 = new int[arr.length-cnt];
		for (int i = 0; i < arr.length - cnt; i++) {
			arr1[i] = arr[i];
			System.out.println(arr1[i]);
		}
		 
	}

}