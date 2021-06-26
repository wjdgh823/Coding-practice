package CodeUp_1010_1027;

import java.util.Scanner;

public class codeup_1026 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String time = sc.next();
		String[] timeArr = time.split(":");
		
		int colonCount = 0;
		for (int i = 0; i < time.length(); i++) {
			if (time.charAt(i) == ':') {
				colonCount++;
			}
		}
		if (colonCount != 2) {
			System.out.println(":이 빠졌습니다.");
			return;
		}
		for (int i = 0; i < timeArr.length; i++) {
			if (timeArr[i].length() != 2) {
				System.out.println("시,분,초는 2자리로 입력해주세요.");
				return;
			} 
		}
		
		System.out.println(timeArr[1]);
		
		
		
	}

}
