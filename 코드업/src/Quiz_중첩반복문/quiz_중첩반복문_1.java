package Quiz_중첩반복문;

import java.util.Scanner;

public class quiz_중첩반복문_1 {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < m; j++) {
				System.out.println(i +  "x" + j + "=" + (i * j));
			}
		}
		
	}

}
