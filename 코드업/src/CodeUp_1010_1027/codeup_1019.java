package CodeUp_1010_1027;

import java.util.Scanner;

public class codeup_1019 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String data = sc.nextLine();
		
		String[] dataArr = data.split("\\.");
		
		String dateResult = "";
		for (int i = 0; i < dataArr.length; i++) {
			if (dataArr[i].length() == 1) {
				dataArr[i] = ".0" + dataArr[i];
			} else if (dataArr[i].length() == 2) {
				dataArr[i] = "." + dataArr[i];
			}
			
			dateResult += dataArr[i];
		}
		
		System.out.println(dateResult);
		
	}

}
