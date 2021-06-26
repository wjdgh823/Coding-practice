package CodeUp_1010_1027;

import java.util.Scanner;

public class codeup_1025_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String num = sc.next();
		char[] arr = num.toCharArray(); // 문자열을 하나씩 짤라서 배열에 저장한다.
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("[" + arr[i]);
			for (int j = arr.length-1; j > i; j--) {
				System.out.print("0");
			}
			System.out.println("]");
		}
		
	}

}
