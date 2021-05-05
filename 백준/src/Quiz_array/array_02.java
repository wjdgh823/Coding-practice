package Quiz_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class array_02 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int i = 0;
		int[] arr = new int[n];
		while(st.hasMoreTokens()) {
			arr[i] = Integer.parseInt(st.nextToken());
			i++;
		}
		Arrays.sort(arr);
		System.out.println("최소숫자 : " + arr[0] + ", 최대숫자 : " + arr[n-1]);
		
	}

}
