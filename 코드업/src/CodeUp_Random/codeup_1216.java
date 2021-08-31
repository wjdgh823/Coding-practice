package CodeUp_Random;

import java.util.Scanner;

public class codeup_1216 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt(); // 홍보를 하지 않을 경우 수입
		int num2 = sc.nextInt(); // 홍보를 할 경우의 수입
		int num3 = sc.nextInt(); // 홍보비용
		
		if (num2 > num1 && num2 > num3) {
			System.out.println("advertise");
		} else if (num1 > num2 && num1 > num3) {
			System.out.println("do not advertise");
		} else {
			System.out.println("dose not matter");
		}
		
		
	}

}
