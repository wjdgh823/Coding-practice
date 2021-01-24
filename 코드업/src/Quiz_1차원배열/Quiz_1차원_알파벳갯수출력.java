package Quiz_1차원배열;

import java.util.Scanner;

public class Quiz_1차원_알파벳갯수출력 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String sentence = sc.nextLine();
		char[] alpa = new char[26];
		int[] alpacount = new int[26];
		
		for (int j = 0; j < alpa.length; j++) {
			alpa[j] = (char)(97 + j);
		}
		
		for (int i = 0; i < sentence.length(); i++) {
			for (int j = 0; j < alpa.length; j++) {
				if(sentence.charAt(i) == alpa[j]) {
					alpacount[j] += 1;
				}
			}
		}
		
		for (int j = 0; j < alpa.length; j++) {
			System.out.println(alpa[j] + " : " + alpacount[j]);
		}
		
	}

}
