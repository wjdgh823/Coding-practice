package CodeUp_Random;

import java.util.Scanner;

public class codeup_1210 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int choice1 = sc.nextInt();
		int choice2 = sc.nextInt();
		
		if (choice1 == choice2) {
			System.out.println("메뉴는 같은 것을 선택할 수 없습니다.");
		}
		
		if (choice1 == 1) {
			choice1 = 400;
		} else if (choice1 == 2) {
			choice1 = 340;
		} else if (choice1 == 3) {
			choice1 = 170;
		} else if (choice1 == 4 ) {
			choice1 = 100;
		} else if (choice1 == 5 ) {
			choice1 = 70;
		}
		if (choice2 == 1) {
			choice2 = 400;
		} else if (choice2 == 2) {
			choice2 = 340;
		} else if (choice2 == 3) {
			choice2 = 170;
		} else if (choice2 == 4 ) {
			choice2 = 100;
		} else if (choice2 == 5 ) {
			choice2 = 70;
		}
		
		if ((choice1 + choice2) > 500) {
			System.out.println("angry");
		} else {
			System.out.println("no angry");
		}
		
	}

}
