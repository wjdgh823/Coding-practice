package Quiz_반복문;

import java.util.Scanner;

public class quiz_반복문_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 'q'가 입력될 때까지 입력한 문자를 계속 출력
		 */
		
		String alpha = ""; 
		
		outer:
			while(true) {
				alpha = sc.nextLine();
				if (alpha.equalsIgnoreCase("q")) {
					break outer;
				}
				System.out.println("계속입력");
			}
		System.out.println("종료");
	}

}
