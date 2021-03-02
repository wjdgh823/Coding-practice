package Quiz_문자열;

import java.util.Scanner;

public class Quiz_문자열_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		for (int i = 0; i < str.length(); i++) {
			System.out.println("'" + str.charAt(i) + "'");
		}
		
	}

}
