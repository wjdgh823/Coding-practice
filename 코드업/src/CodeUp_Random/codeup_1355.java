package CodeUp_Random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup_1355 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader be = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(be.readLine());
		
		for (int i = 0; i < n; i++) {
			for(int a = 0; a < i; a++) {
				System.out.print(" ");
			}
			for(int b = n; b > i; b--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
