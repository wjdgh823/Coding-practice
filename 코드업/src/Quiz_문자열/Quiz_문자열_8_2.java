package Quiz_문자열;

import java.util.Scanner;

public class Quiz_문자열_8_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 't') {
				System.out.print(i+1+" ");
			}
		}
		
	}

}
