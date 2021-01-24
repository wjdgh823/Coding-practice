package Quiz_반복문;

import java.util.Scanner;

public class quiz_반복문_4 {

	public static void main(String[] args) {
		
		/*
		 * 어떤 두 수 a,b 가 있을때 두 수 사이의 모든 정수를 오름차순으로 출력하시오,.
		 * 예를 들어, a=5, b=10일 경우 5 6 7 8 9 10입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		while (true) {
			
			System.out.print(a + "\t");
			a++;
			
			if (a == b + 1) {
				break;
			}
			
		}
		
	}

}
