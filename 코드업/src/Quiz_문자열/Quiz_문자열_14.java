package Quiz_문자열;

import java.util.Scanner;

public class Quiz_문자열_14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();
		
		if (s1.charAt(s1.length() -1) == s2.charAt(0) &&
			s2.charAt(s2.length() -1) == s3.charAt(0) &&
			s3.charAt(s3.length() -1) == s1.charAt(0)) {
			System.out.println("good");
		} else {
			System.out.println("bad");
		}
		
	}

}
