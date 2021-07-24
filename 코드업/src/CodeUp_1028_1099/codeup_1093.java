package CodeUp_1028_1099;

import java.util.Scanner;

public class codeup_1093 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		int[] students = new int[23];
		int numbers = 0;
		
		for (int i = 0; i < count; i++) {
			numbers = sc.nextInt();
			students[numbers - 1] += 1;
		}
		sc.close();
		
		for (int i = 0; i < students.length; i++) {
			System.out.printf("%d ", students[i]);
		}
		
		// 다시 풀기
		
	}

}
