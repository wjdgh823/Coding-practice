package Quiz_1차원배열;

import java.util.Scanner;

public class Quiz_1차원_기초 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();  //출석번호를 부른 횟수
		int [] a = new int[24]; // 24개의 저장공간이 0의 값을 가지고 있음.
		
		for (int i = 0; i < n; i++) {
			int t = sc.nextInt(); //n의 개수만큼 숫자 입력
			a[t] = a[t] + 1;
		}
		
		for(int i = 1; i <= 23; i ++) {
			System.out.print(a[i] + "  ");
		}
	
	}

}
