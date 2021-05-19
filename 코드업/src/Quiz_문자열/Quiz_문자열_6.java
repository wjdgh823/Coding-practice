package Quiz_문자열;

import java.util.Scanner;

public class Quiz_문자열_6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String garo = sc.next();
		int startCnt = 0;
		int endCnt = 0;
		
		for (int i =0; i < garo.length(); i++) {
			if (garo.charAt(i) == '(') {
				startCnt++;
			} else if (garo.charAt(i) == ')') {
				endCnt++;
			}
		}
		
		System.out.print(startCnt + " ");
		System.out.print(endCnt);
		
	}

}
