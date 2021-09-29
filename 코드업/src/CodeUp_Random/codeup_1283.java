package CodeUp_Random;

import java.util.Scanner;

public class codeup_1283 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); // 투자 액수
		int b = sc.nextInt(); // 투자 일수
		int [] arr = new int[b]; // 일별 변경 폭(%)
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt(); // 변경 폭 저장
		}

		
		int result = a;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				result -=  result  * (arr[i] * -1 * 0.01);
				System.out.println(result + "-일때");
			} else {
				result += result  * (arr[i] * 0.01);
				System.out.println(result + "+일때");
			}
		}
		
		System.out.println(result-a);
		if (result - a == 0) {
			System.out.println("same");
		} else if (result - a < 0) {
			System.out.println("bad");
		} else {
			System.out.println("good");
		}
		
		
		
	}

}
