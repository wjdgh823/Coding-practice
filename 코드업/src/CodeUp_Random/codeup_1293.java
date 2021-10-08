package CodeUp_Random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup_1293 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(br.readLine());
		
		int[] scoreArr = new int[n];
		
		for (int i = 0; i < scoreArr.length; i++) {
			scoreArr[i] = Integer.parseInt(br.readLine());
		}
		
		int max = 0;
		int min = 100000;
		
		for (int i = 0; i < scoreArr.length; i++) {
			if (scoreArr[i] > max) {
				max = scoreArr[i];
			} else if (scoreArr[i] < min) {
				min = scoreArr[i];
			}
		}
		
		sb.append(max + " ");
		sb.append(min);
		
		
		System.out.println(sb.toString());
		
	}

}
