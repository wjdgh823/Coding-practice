package Quiz_1차원배열;

import java.util.Scanner;

public class Quiz_1차원_문자열출력 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String [] oneStr = new String[str.length()];
		
		
		for (int i = 0; i < str.length(); i++) {
			oneStr[i] = str.substring(i, i+1);
			if(oneStr[i].equals(" ")) {
				oneStr[i] = "";
			}
			System.out.print(oneStr[i]);
		}
		
		
	}

}
