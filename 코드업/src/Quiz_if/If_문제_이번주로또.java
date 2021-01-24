package Quiz_if;

import java.util.Scanner;

public class If_문제_이번주로또 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sameCount = 0;
		int bonusCount = 0;
		
		int winNum1 = sc.nextInt();
		int winNum2 = sc.nextInt();
		int winNum3 = sc.nextInt();
		int winNum4 = sc.nextInt();
		int winNum5 = sc.nextInt();
		int winNum6 = sc.nextInt();
		int bonus = sc.nextInt();
		
		int myNum1 = sc.nextInt();
		int myNum2 = sc.nextInt();
		int myNum3 = sc.nextInt();
		int myNum4 = sc.nextInt();
		int myNum5 = sc.nextInt();
		int myNum6 = sc.nextInt();
		
		if (winNum1 == myNum1) {
			sameCount++;
		}
		if (winNum2 == myNum2) {
			sameCount++;
		}
		if (winNum3 == myNum3) {
			sameCount++;
		}
		if (winNum4 == myNum4) {
			sameCount++;
		}
		if (winNum5 == myNum5) {
			sameCount++;
		}
		if (winNum6 == myNum6) {
			sameCount++;
		}
		if (bonus == myNum1 || bonus == myNum2 || bonus == myNum3 || bonus == myNum4 || bonus == myNum5 || bonus == myNum6) {
			bonusCount++;
			sameCount++;
		}
		
		System.out.println(sameCount);
		if (sameCount <= 2) {
			System.out.println("꽝");
		} else if (sameCount == 3) {
			System.out.println("5등");
		} else if (sameCount == 4) {
			System.out.println("4등");
		} else if (sameCount == 5) {
			System.out.println("3등");
		} else if (sameCount == 5 && bonusCount == 1) {
			System.out.println("2등");
		} else if (sameCount == 6){
			System.out.println("1등");
		}
	
		
	}

}
