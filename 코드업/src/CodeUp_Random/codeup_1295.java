package CodeUp_Random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup_1295 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuffer sb = new StringBuffer();
		
		String sentence = br.readLine();
		
		String[] arr = new String[sentence.length()];
		
		for (int i = 0; i < sentence.length(); i++) {
			if (Character.isUpperCase(sentence.charAt(i)) == true) {
				arr[i] = (sentence.charAt(i)+"").toLowerCase();
			} else {
				arr[i] = (sentence.charAt(i)+"").toUpperCase();
			}
		}
		
		for (int i = 0; i < sentence.length(); i++) {
			sb.append(arr[i]);
		}
		
		System.out.println(sb.toString());
		
	}

}
