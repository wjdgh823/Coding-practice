package Quiz_중첩반복문;

import java.util.Scanner;

public class quiz_중첩반복문_삼각형출력 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		// n = 7
		
		for (int i = 0; i < n/2+1; i++) { // 0 1 2 3 (7/2+1 == 3) 4번 돌아간다
				// 빈칸 먼저
				for (int j= 0; j < n / 2 - i; j++) { // 0 1 2 (7 / 2 - 0 == 3) 3번 돌아간다
					System.out.print("  ");
				}
				// 별마지막
				for (int j = 0; j < i * 2 + 1; j++) { // 0(1 * 0 + 1 == 1)
					System.out.print("*");
					
				}
				System.out.println();
		}
		
		
		
				
		// 별같은 경우는 2개 씩 증가하는 패턴
		// 빈칸같은 경우는 1칸씩 없어지는 패턴
		
		//빈칸 3 별 1
		//빈칸 2 별 3
		//빈칸 1 별 5
		//빈칸 0 별 7
		
		//빈칸 5 	별1
		//빈칸 4 	별3
		//빈칸 3 	별5
		//빈칸 2 	별7
		//빈칸 1 	별9
		//빈칸 0 	별11
		
		
	}

}
