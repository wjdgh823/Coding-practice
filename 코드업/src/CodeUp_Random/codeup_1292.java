package CodeUp_Random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup_1292 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuffer sb = new StringBuffer();
		
		String DNA = br.readLine();
		
		int DNAtotal = 0;
		
		for (int i = 0; i < DNA.length(); i++) {
			DNAtotal += Integer.parseInt(DNA.charAt(i) + "");
		}
		
		if (DNAtotal % 7 == 4) {
			sb.append("suspect");
		} else {
			sb.append("citizen");
		}
		
		System.out.println(sb.toString());
		
	}

}
