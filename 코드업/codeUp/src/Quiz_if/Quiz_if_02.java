package Quiz_if;

import java.util.Scanner;

public class Quiz_if_02 {

	public static void main(String[] args) {

		/*
		�� ���� ���ڰ� �־��� �� �ι�°�� ���� ��������غ���.
		���� ���, 5 9 2 �� �ִٸ� �ι�°�� ���� ���� 5�̴�.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� : ");
		int a = sc.nextInt();
		System.out.print("�ι�° ���� : ");
		int b = sc.nextInt();
		System.out.print("����° ���� : ");
		int c = sc.nextInt();
		int result = 0;
		
		if (a <= b && a <= c) {
			if (b < c) {
				result = b;
			} else {
				result = c;
			}
		} else if (b <= a && b <= c) {
			if (a < c) {
				result = a;
				
			} else {
				result = c;
			}
		} else if (c <= a && c <= b) {
			if (a < b) {
				result = a;
			} else {
				result = b;
			}
		} 
		
		System.out.println(result);
		
		
	}

}
