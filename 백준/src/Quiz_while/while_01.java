package Quiz_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class while_01 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			
			st = new StringTokenizer(br.readLine(), " ");
			System.out.println(st);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if (a==0&&b==0) {
				break;
			}
			sb.append((a+b)).append('\n');
		}
		System.out.println(sb);
		
	}
	
}
