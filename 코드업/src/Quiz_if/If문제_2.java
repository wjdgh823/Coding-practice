package Quiz_if;

import java.util.Scanner;

public class If문제_2 {
	
	public static void main(String[] args) {
		
		//세 정수 a, b, c가 입력되었을 때, 짝(even)/홀(odd)을 출력해보자.
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a % 2 == 0) {
			System.out.println("짝");
		} else {
			System.out.println("홀");
		}
		
		if (b % 2 == 0) {
			System.out.println("짝");
		} else {
			System.out.println("홀");
		}
		
		if (c % 2 == 0) {
			System.out.println("짝");
		} else {
			System.out.println("홀");
		}
	}

}
