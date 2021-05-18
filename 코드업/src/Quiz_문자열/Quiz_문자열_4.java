package Quiz_문자열;

import java.util.Scanner;

public class Quiz_문자열_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String[]array = str.split(" ");
		
		String plus = "";
		for(int i = 0; i < array.length; i++) {
			plus += array[i];
		}
		
		System.out.println(plus);
	}

}
