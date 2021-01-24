package Quiz_중첩반복문;

import java.util.Scanner;

public class quiz_중첩반복문_평행사변형 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();  			// 높이	
		int k = sc.nextInt();			// 밑변
		String d = sc.next();			// 방향
		
		if (d.equalsIgnoreCase("l"))
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < 2* i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < k; j++) {
					System.out.print("*");
				}
				System.out.println();
		} else if (d.equalsIgnoreCase("r")) {
			for (int i = h; i > 0; i--) {
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < k; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else {
			System.out.print("L 또는 R만 입력하세요.");
		}
	}

}
