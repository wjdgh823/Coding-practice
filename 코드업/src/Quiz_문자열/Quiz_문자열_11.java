package Quiz_문자열;

import java.util.Scanner;

public class Quiz_문자열_11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("id : ");
		String id = sc.nextLine();
		
		if (id.equals("anaki")) {
			System.out.println("welcome! anaki");
		} else {
			System.out.println("아이디를 확인하세요.");
		}
		
	}

}
