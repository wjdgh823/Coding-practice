package Quiz_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array_06_2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		String arr[] = new String[n];
		
		for (int i =0; i < n; i++) {
			arr[i] = br.readLine();
		}
		
		for (int i = 0; i < n; i++) {
			int count = 0;
			int sum = 0;
			
			for (int j = 0; j < arr[i].length(); j++) {
				if (arr[i].charAt(j) == '0') {
					count++;
				} else {
					count = 0;
				}
				sum += count;
			}
			
			sb.append(sum).append('\n');
			
		}
		
		System.out.println(sb);
		
	}

}
