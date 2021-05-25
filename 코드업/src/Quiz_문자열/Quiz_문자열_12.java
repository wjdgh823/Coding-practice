package Quiz_문자열;

import java.util.Scanner;

public class Quiz_문자열_12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		String str2 = sc.next();
		
		if (str1.length() < str2.length()) {
			System.out.println(str1 + " " + str2);
		} else if (str1.length() > str2.length()) {
			System.out.println(str2 + " " + str1);
		} else {
			for (int i = 0; i < str1.length(); i++) {
				if (str1.charAt(i) < str2.charAt(i)) {
					System.out.println(str1 + " " + str2);
					break;
				} else if (str1.charAt(i) > str2.charAt(i)) {
					System.out.println(str2 + " " + str1);
					break;
				} else {
					continue;
				}
			}
		}
		
	}

}
