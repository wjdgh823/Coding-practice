package Quiz_while;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class while_03_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		int copy = n;
		
		while (true) {
		
			n = ((n%10) * 10 + (((n%10) + (n/10)) %10));
			cnt++;
			
			if (n == copy) {
				break;
			}
		}
		System.out.println(cnt);
	}

}
