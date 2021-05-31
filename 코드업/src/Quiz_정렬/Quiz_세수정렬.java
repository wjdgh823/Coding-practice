package Quiz_정렬;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz_세수정렬 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] n = new int[3];
		for (int i = 0; i < n.length; i++) {
			int num = sc.nextInt();
			n[i] = num;
		}
		
		Arrays.sort(n);
		
		for (int i = 0;  i < n.length; i++) {
			System.out.println(n[i]+ " ");
		}
		
		
		
		
		
	}

}
