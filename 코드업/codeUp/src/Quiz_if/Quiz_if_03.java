package Quiz_if;

import java.util.Scanner;

public class Quiz_if_03 {

	public static void main(String[] args) {
		
		/*
		 ��ȣ�� 30�� ������ ���ư��� ���� 1�� �̴�.
		 ������ �������� �ð��� ���� �־�����.
		 �׷��� �� �ð��� �������� 30������ �ð��� ����Ͻÿ�.

		 ��)
		 12 35  =====> 12 5
		 12 0 ======> 11 30
		 11 5 ======> 10 35
		*/
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int pre_minute = sc.nextInt();
		
		if (minute >= pre_minute) {
			minute -= pre_minute;
		} else if (minute < pre_minute) {
			hour -= 1;
			minute = 60 - (pre_minute - minute);
		}
		
		System.out.println(hour + "��" + minute + "��");
		

	}

}
