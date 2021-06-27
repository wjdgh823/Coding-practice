package CodeUp_1010_1027;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class codeup_1027 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String date = sc.next();
		
		String[] dateArr = date.split("\\.");
		
		java.util.List<String> list = Arrays.asList(dateArr);
		
		Collections.reverse(list);
		
		dateArr = list.toArray(new String[list.size()]);
		
		for (int i = 0; i < dateArr.length; i++) {
			if (i == dateArr.length - 1) {
				System.out.print(dateArr[i]);
			} else if (i < dateArr.length -1) {
				System.out.print(dateArr[i] + "-");
			}
		}
		
	}

}
