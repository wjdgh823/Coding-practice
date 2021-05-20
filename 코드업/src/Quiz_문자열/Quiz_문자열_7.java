package Quiz_문자열;

import java.util.Scanner;

public class Quiz_문자열_7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String[] arr = str.split("");
		
		int C = 0;
		int CC = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equalsIgnoreCase("c")) {
				C++;
			}
			if ((arr[i].equalsIgnoreCase("c")) && (arr[i+1].equalsIgnoreCase("c"))) {
				CC++;
			}
		}
		
		System.out.println(C + " " + CC);
		
		
	}

}
