package CodeUp_Random;

import java.util.Scanner;

public class codeup_1206 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int x = b/a;
		int y = a/b;
		
		if (a * x == b) {
			System.out.println(a + "x" + x + "=" + b) ;
		} else if (b * y  == a) {
			System.out.println(b + "x" + y + "=" + a);
		} else {
			System.out.println("none");
		}
		
	}

}
