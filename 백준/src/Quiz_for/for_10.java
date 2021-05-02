package Quiz_for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class for_10 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine(), " ");
		// 문자열을 분리해주어야하기 때문에 StringTokenizer가 필요
		
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(st.nextToken());
			
			if (a < x) {
				sb.append(a).append(" ");
			}
		}
		System.out.println(sb);
		
	}

}
