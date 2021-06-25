package CodeUp_1010_1027;

import java.util.Scanner;

public class codeup_1020 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String CustNum = sc.next();
		
		String[] CustNumArr = CustNum.split("-");
		
		
		String result = "";
		
		for (int i = 0; i < CustNumArr.length; i++) {
			if (CustNumArr[0].length() != 6) {
				System.out.println("주민번호 앞자리 형식이 틀렸습니다.");
				return;
			}
			if (CustNumArr[1].length() != 7) {
				System.out.println("주민번호 뒷자리 형식이 틀렸습니다.");
				return;
			}
			result += CustNumArr[i];
		}
		
		System.out.println(result);
		
	}

}
