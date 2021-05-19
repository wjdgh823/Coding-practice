package Quiz_문자열;

import java.util.Scanner;

public class Quiz_문자열_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String pw = sc.nextLine();
		
		for (int i = 0; i < pw.length(); i++) {
			System.out.printf("%c", pw.charAt(i) + 2);
		}
		
		System.out.println();
		
		for (int i = 0; i < pw.length(); i++ ) {
			System.out.printf("%c", (pw.charAt(i) * 7) % 80 + 48);
		}
		
		
	}

}
