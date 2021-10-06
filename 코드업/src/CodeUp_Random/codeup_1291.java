package CodeUp_Random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup_1291 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		int resultVal = 0;
		
		for (int i = 1; i <= c; i++) {
			if (a % i == 0 && b % i == 0 && c % i == 0) {
				resultVal = i;
			}
		}
		
		sb.append(resultVal);
		
		System.out.println(sb.toString());
		
		
		
		
	}

}
