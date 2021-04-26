package Quiz_if;

import java.util.Scanner;

public class if_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			
			System.out.println("점수를 입력하세요.");
			int testScore = sc.nextInt();
			if (testScore < 0 || testScore > 100) {
				System.out.println("점수는 0 ~ 100까지만 입력하세요.");
				continue;
			}
			
			if (testScore > 90 || testScore <= 100) {
				System.out.println("A");
				return;
			} else if (testScore > 80 || testScore <=89) {
				System.out.println("B");
				return;
			} else if (testScore > 70 || testScore <= 79) {
				System.out.println("C");
				return;
			} else if (testScore > 60 || testScore <= 69) {
				System.out.println("F");
				return;
			}
		}
		
		
	}

}
