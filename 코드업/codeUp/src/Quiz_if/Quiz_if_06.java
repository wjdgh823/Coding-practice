package Quiz_if;

import java.util.Scanner;

public class Quiz_if_06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if ((a + b) > c) {
			System.out.println("yes");
		} else if ((a + b) < c){
			System.out.println("no");
		}
		
		
	}

}
