package Quiz_if;

import java.util.Scanner;

public class Quiz_if_07 {

	public static void main(String[] args) {

		/*
		�ﰢ���� 3���� ���� a, b, c�� �Է����� �־�����.

		���⼭ �ԷµǴ� ���� ����� a �� b �� c �̴�. 

		�� �ﰢ���� ���� �ﰢ������ ����Ͻÿ�.
		*/
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a + b > c) {
			if (a == b && b == c) {
				System.out.println("���ﰢ��");
			} else if (a * a + b * b == c * c) {
				System.out.println("�����ﰢ��");
			} else if (a == b || b == c || a == c) {
				System.out.println("�̵�ﰢ��");
			} else {
				System.out.println("�ﰢ��");
			}
		} else {
			System.out.println("�ﰢ�� x");
		}
		
	}

}
