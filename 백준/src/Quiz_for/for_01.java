package Quiz_for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class for_01 {

	public static void main(String[] args) throws IOException {

	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int dan = Integer.parseInt(br.readLine());
		
		
		for (int n = 1; n <= 9; n++) {
			System.out.println(dan + "x" + n + "=" + (dan*n)); 
		}
		
		br.close();
		
	}

}
