package Quiz_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class array_04_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> save = new HashSet<Integer>();
		
		for(int i = 0; i < 10; i++) {
			save.add(Integer.parseInt(br.readLine()) % 42);
		}
		
		System.out.println(save.size());
		
	}

}
