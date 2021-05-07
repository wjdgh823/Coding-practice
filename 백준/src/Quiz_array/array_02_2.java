package Quiz_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array_02_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int [] array = new int[9];
		for (int i =0; i < 9; i ++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		int max = 0;
		int order = 0;
		int cnt = 0;
		
		for (int val : array) {
			cnt++;
			if (val > max) {
				max = val;
				order = cnt;
			}
		}
		
		System.out.println("최대값 : " + max + ", 몇번째? " + order);
		
	}

}
