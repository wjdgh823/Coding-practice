package CodeUp_Random;

import java.util.Scanner;

public class codeup_1254 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		char start = sc.next().charAt(0);
		char end = sc.next().charAt(0);
		
		int iStart = (int) start;
		int iEnd = (int) end;
		
		
		if (iStart < iEnd) {
			while(iStart <= iEnd) {
				System.out.print((char)iStart + " ");
				iStart++;
			}
		} else if (iEnd < iStart) {
			while (iEnd <= iStart) {
				System.out.print((char)iEnd + " ");
				iEnd++;
			}
		} else {
			System.out.println(start);
		}
		
	}

}
