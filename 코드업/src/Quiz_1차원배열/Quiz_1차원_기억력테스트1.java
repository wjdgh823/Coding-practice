package Quiz_1차원배열;

import java.util.Scanner;

public class Quiz_1차원_기억력테스트1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[10];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		int k = sc.nextInt();
		
		System.out.println(num[k-1]);
	}

}
