package Quiz_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class while_02_3 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str;
		
		while( (str=br.readLine()) != null) {
			int a = str.charAt(0) - '0';
			int b = str.charAt(2) - '0';
			System.out.println(a);
			System.out.println(b);
			sb.append(a+b).append("\n");
		}
		System.out.println(sb);
		
	}

}
