package Quiz_if;

import java.util.Scanner;

public class Quiz_if_04 {
	
	public static void main(String[] args) {
	
		/*
		��ȣ�� �߸��� �ǰ� �����ϰ�, ��ǻ�� ���α׷��� �ǰ� �����Ѵ�.
		��� �� ��ȣ�� ��ǻ�͸� ����ϴ� �� �������� �� ���� ������ ������.
		�׷��� �������� n��ŭ ���� �˾Ƽ� �����⸦ �������ִ� �������� ������� �Ѵ�.
		�� �� �����ϴ� �˰����� ������ ����.
		10�� �ڸ����� 1�� �ڸ����� ���� �ٲٰ�, �ű⿡ 2�� ���Ѵ�.
		��) 70�� ��� 14�� �ȴ�.( 70 -> 07 -> 14 )
		�� �˰����� ���δ� ���ۿ��� ������ �������� ������ �� ���� ������ �𸥴�.
		���� �� �˰����� �ɰ��� ���ۿ����� ��ġ�� 100�� �Ѵ´ٸ� 100�� �ڸ����� ���õȴ�.
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
