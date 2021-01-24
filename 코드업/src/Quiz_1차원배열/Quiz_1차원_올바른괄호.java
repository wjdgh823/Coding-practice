package Quiz_1차원배열;

import java.util.Scanner;

public class Quiz_1차원_올바른괄호 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String 괄호 = sc.next();
		String[] 괄호저장 = new String[괄호.length()];
		int count_left = 0;
		int count_right = 0;
		
		for (int i = 0; i < 괄호저장.length; i++) {
			괄호저장[i] = 괄호.substring(i, i+1);
			if(괄호저장[i].equals("(")) {
				count_left++;
			} else if (괄호저장[i].equals(")")) {
				count_right++;
			}
			
		}
		System.out.println(count_left + " " + count_right);
	
	}

}
