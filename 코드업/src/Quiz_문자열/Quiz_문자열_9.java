package Quiz_문자열;

import java.util.Scanner;

public class Quiz_문자열_9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String[] contence = str.split("");
		
		int loveCnt = 0;
		
		for (int i = 0; i < contence.length; i++) {
			if (contence[i].equalsIgnoreCase("l") && contence[i+1].equalsIgnoreCase("o") &&
				contence[i+2].equalsIgnoreCase("v") && contence[i+3].equalsIgnoreCase("e")) {
				loveCnt++;
			}
		}
		
		System.out.println(loveCnt);
	}

}
