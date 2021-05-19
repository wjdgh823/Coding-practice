package Quiz_문자열;

import java.util.Scanner;

public class Quiz_문자열_6_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String [] arr = str.split(""); // 입력된것 하나씩 짤라서 배열로 담는다.
		
		int count1 = 0;
		int count2 = 0;
		
		for (int i = 0; i <arr.length; i++) {
			if (arr[i].equals("(")) {
				count1++;
			} else if (arr[i].equals(")")) {
				count2++;
			}
		}
		
		System.out.println(count1 + " " + count2);
		
	}

}
