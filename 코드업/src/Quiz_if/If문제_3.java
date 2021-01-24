package Quiz_if;

import java.util.Scanner;

public class If문제_3 {

	public static void main(String[] args) {
		
		//정수 1개가 입력되었을 때, 음(minus)/양(plus)과 짝(even)/홀(odd)을 출력해보자.
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if (a < 0) {
			System.out.println("음수");
		} else if (a > 0) {
			System.out.println("양수");
		} 
		
		if (a % 2 == 0) {
			System.out.println("짝");
		} else {
			System.out.println("홀");
		}
	}
		
}
