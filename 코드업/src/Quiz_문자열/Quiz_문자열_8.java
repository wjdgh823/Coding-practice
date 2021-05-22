package Quiz_문자열;

import java.util.Scanner;

public class Quiz_문자열_8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String[] arr = str.split("");
		
		for (int i = 0; i < arr.length; i++)  {
			if (arr[i].equalsIgnoreCase("t")) {
				System.out.print(i + 1 + " ");
			}
		}
		
	}

}
