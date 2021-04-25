package Quiz_if;

import java.util.Scanner;

public class if_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("A를 입력하세요.");
		int A = sc.nextInt();
		System.out.println("B를 입력하세요.");
		int B = sc.nextInt();
		
		
		
		if (A > B) {
			System.out.println(">");
		} else if (A < B) {
			System.out.println("<");
		} else if (A == B) {
			System.out.println("==");
		}
		
	}

}
