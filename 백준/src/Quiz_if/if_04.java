package Quiz_if;

import java.util.Scanner;

public class if_04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("x를 입력하세요.");
		int x = sc.nextInt();
		System.out.println("y를 입력하세요.");
		int y = sc.nextInt();
		
		if (x > 0 && y > 0) {
			System.out.println("1");
		} else if (x < 0 && y > 0) {
			System.out.println("2");
		} else if (x < 0 && y < 0) {
			System.out.println("3");
		} else if (x > 0 && y < 0) {
			System.out.println("4");
		}
		
	}

}
