package Quiz_1차원배열;

import java.util.Scanner;

public class Quiz_1차원_기억력테스트2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] Nnum = new int[N];
		for (int i = 0; i < Nnum.length; i++) {
			Nnum[i] = sc.nextInt();
		}
		
		int M = sc.nextInt();
		int[] Mnum = new int[M];
		for (int j = 0; j < Mnum.length; j++) {
			Mnum[j] = sc.nextInt();
		}
		
		for (int j = 0; j < Mnum.length; j++) {
			for (int i = 0; i < Nnum.length; i++) {
				if (Mnum[j] == Nnum[i]) {
					Mnum[j] = 1;
				} else if (Mnum[j] != Nnum[i]) {
					Mnum[j] = 0;
				}
			}
		}
		
		for (int j = 0; j < Mnum.length; j++) {
			System.out.println(Mnum[j]);
		}
		
	}

}
