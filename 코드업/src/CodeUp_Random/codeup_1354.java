package CodeUp_Random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup_1354 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++ ) {
			for (int j = n; j > i; j--) {
				 System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
