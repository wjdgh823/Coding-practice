package CodeUp_Random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup_1290 {

	public static void main(String[] args) throws IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = br.read();
		
		System.out.println(getNum(n));
		
	}
	
	public static int getNum(int n) {
		int aliquot = 0;
		
		for(int i = 1; i <= n; i++) {
			if (n % i == 0) 
				aliquot++;
		}
			return aliquot;
	}
	
}
