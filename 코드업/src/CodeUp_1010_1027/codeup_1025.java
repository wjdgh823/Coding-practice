package CodeUp_1010_1027;

import java.util.Scanner;

public class codeup_1025 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String num = sc.next();
		
		if (num.length() != 5) {
			System.out.println("다섯자리 정수를 입력해야합니다.");
			return;
		}
		
		String one = "";
		String two = "";
		String three = "";
		String four = "";
		String five = "";
		
		for (int i = 1; i <= num.length(); i++) {
			if (i == 1) {
				one = num.charAt(0) + "0000";
			} else if (i == 2) {
				two = num.charAt(1) + "000";
			} else if (i == 3) {
				three = num.charAt(2) + "00";
			} else if (i == 4) {
				four = num.charAt(3) + "0";
			} else {
				five = num.charAt(4) + "";
			}
		}

		System.out.println("[" + one + "]");
		System.out.println("[" + two + "]");
		System.out.println("[" + three + "]");
		System.out.println("[" + four + "]");
		System.out.println("[" + five + "]");
		
	}

}
