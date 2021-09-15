package CodeUp_Random;

import java.util.Scanner;

public class codeup_1260 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		if (a > b) {
			System.out.println("a가 b보다 작은 숫자를 입력해야합니다.");
			return;
		}

		for (int i = a; i <= b; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
			
		System.out.println(sum);
	}

}
