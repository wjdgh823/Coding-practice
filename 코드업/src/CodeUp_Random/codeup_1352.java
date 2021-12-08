package CodeUp_Random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup_1352 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(br.readLine());
		
		String star = "";
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
