package CodeUp_Random;

import java.util.Scanner;

public class codeup_1169 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		// 만약 나이가 18살 이면
		
		int birthYear = 0;
		int seperator = 0;
		birthYear = 2012 - (age-1);
		
		String finalBirthYear = "";
		if (birthYear < 2000) {
			finalBirthYear = String.valueOf(birthYear).substring(2);
		} else {
			finalBirthYear = String.valueOf(birthYear).substring(3);
		}
		
		if (age < 13) {
			seperator = 3;
		} else {
			seperator = 1;
		}
		
		System.out.println(finalBirthYear + " " + seperator);
		
	}

		
}

