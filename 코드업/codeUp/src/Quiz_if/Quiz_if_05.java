package Quiz_if;

import java.util.Scanner;

public class Quiz_if_05 {

	public static void main(String[] args) {

		/*
		 * ��ȣ �߸� �����Ѵ�. ���α׷��� ������
		 * ����� �������� �� ���� �����ߴ�
		 * �׷��� �������� n��ŭ ���� ���� �����⸦ �������ִ� �������� ������� �Ѵ�.
		 * �̶� �����ϴ� �˰����� ������ ����.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������� �ڵ����� ���ط� �Է� : ");
		String n = sc.next();
		String ten = n.substring(0, 1);
		String one = n.substring(1);
		String change = one + ten;
		int result = Integer.parseInt(change) * 2;
		System.out.println(result);
		
		if (result > 50) {
			System.out.println("oh my god");
		} else {
			System.out.println("good");
		}
		
		
	}

}
