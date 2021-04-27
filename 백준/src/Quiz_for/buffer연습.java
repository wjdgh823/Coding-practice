package Quiz_for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class buffer연습 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("숫자를 입력하세요\n");
		int a = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < a; i++) {
			int b = Integer.parseInt(br.readLine());
			int c = Integer.parseInt(br.readLine());
		}
		bw.flush();
		bw.close();
	}

}
